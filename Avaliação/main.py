import random

def gerar_listas(Listas, Tamanho):
    listas = []
    for _ in range(Listas):
        lista = [random.randint(1, 100) for _ in range(Tamanho)]
        listas.append(lista)
    return listas

def mostrar_listas(listas):
    for i, lista in enumerate(listas):
        print(f"Lista {i + 1}: {lista}")

def numeros_que_aparecem(listas):
    numeros = set()
    for lista in listas:
        numeros.update(lista)
    return numeros

def numeros_que_aparecem_em_apenas_uma(lista_generica):
    todos_numeros = set()
    unicos = set()
    repetidos = set()

    for lista in lista_generica:
        for numero in lista:
            if numero in todos_numeros:
                unicos.discard(numero)
                repetidos.add(numero)
            else:
                todos_numeros.add(numero)
                unicos.add(numero)

    return unicos - repetidos

Listas = 1000  # Número de listas
Tamanho = 500  # Tamanho das listas

listas = gerar_listas(Listas, Tamanho)

print("EXIBIÇÃO DAS LISTAS:")
mostrar_listas(listas)

print("\nNÚMEROS QUE APARECEM NAS LISTAS:")
print(numeros_que_aparecem(listas))

print("\nNÚMEROS QUE APARECEM EM APENAS UMA LISTA:")
valores_unicos = numeros_que_aparecem_em_apenas_uma(listas)
if valores_unicos:
    print(valores_unicos)
else:
    print("0")
