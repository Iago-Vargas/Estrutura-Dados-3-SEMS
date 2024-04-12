package Aula;
import java.util.Queue;
import java.util.Scanner;
import java.time.Duration;
import java.util.LinkedList;

// Estrutura de Dados
//   -Fisicas: Variaveis
//   -Abstratas: pilha(stack), lista(list), fila(queue)
//      pilha: push/add/append e pop remove -> topo
//      lista: add/append, remove, contains, sort -> ordenação e controle de duplicidade
//		fila:  add/append(final) e remove (inicio) 
// Fila - Fifo - first In, first Out



public class Exemplo3 {
	public static void main (String [] src) {
		Scanner scanner = new Scanner (System.in);
		Queue<Aluno> filaAlunos = new LinkedList<Aluno>();
		int matricula;
		String nome;
		
		filaAlunos.add(new Aluno (1,"Saccol"));
		filaAlunos.add(new Aluno (2, "Pinheiro"));
		filaAlunos.add(new Aluno (3,"Iago"));
		
		for (int i = 0 ; i < 2 ; i++) {
			System.out.println ("Matricula: ");
			matricula = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println ("Nome: ");
			nome = scanner.nextLine();
			filaAlunos.add (new Aluno(matricula, nome));
		}
		
		
		System.out.println("Exibindo fila: ");
		System.out.println(filaAlunos);
		
		System.out.println("Exibindo inicio ou cabeca/head da fila: ");
		System.out.println(filaAlunos.peek());
		
		System.out.println("Exibindo se fila esta ou nao vazia: ");
		System.out.println(filaAlunos.isEmpty());
		
		System.out.println("Exibindo o tamanho: ");
		System.out.println(filaAlunos.size());
		
		System.out.println("Verificando se IAGO esta ou nao na fila: ");
		Aluno a = new Aluno (3,"Iago");
		System.out.println(filaAlunos.contains(a));
		
		while (!filaAlunos.isEmpty()) {
			System.out.println ("Removendo... "+filaAlunos.poll()); //.remove apos apagar termina o codigo, o poll apaga e segue sem erros
	}
  }
}
