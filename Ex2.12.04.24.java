package Aula;
import java.util.Queue;
import java.time.Duration;
import java.util.LinkedList;

// Estrutura de Dados
//   -Fisicas: Variaveis
//   -Abstratas: pilha(stack), lista(list), fila(queue)
//      pilha: push/add/append e pop remove -> topo
//      lista: add/append, remove, contains, sort -> ordenação e controle de duplicidade
//		fila:  add/append(final) e remove (inicio) 
// Fila - Fifo - first In, first Out

public class Exemplo2 {
	public static void main (String [] src) {
		Queue<String> filaNumeros = new LinkedList<String>();
		
		filaNumeros.add("Saccol");
		filaNumeros.add("Pinheiro");
		filaNumeros.add("Iago");
		
		System.out.println("Exibindo fila: ");
		System.out.println(filaNumeros);
		
		System.out.println("Exibindo inicio ou cabeça/head da fila: ");
		System.out.println(filaNumeros.peek());
		
		System.out.println("Exibindo se fila esta ou nao vazia: ");
		System.out.println(filaNumeros.isEmpty());
		
		System.out.println("Exibindo o tamanho: ");
		System.out.println(filaNumeros.size());
		
		System.out.println("Verificando se IAGO esta ou nao na fila: ");
		System.out.println(filaNumeros.contains("IAGO"));
		
		while (!filaNumeros.isEmpty()) {
			System.out.println ("Removendo... "+filaNumeros.poll()); //.remove apos apagar termina o codigo, o poll apaga e segue sem erros
		}		
	}
}