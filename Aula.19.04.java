package Aula;
import java.util.ArrayList;
import javax.swing.JOptionPane;

//1) lista - ordenação e controle duplicidade
// percorrer -for
// inserir   -add, Add, append
// remover	 -remove, Remove
// esta contido - contains, Contains, in
// tamanho - size, count, len
// esta vazio - isEmpty, Empty, empty
// Aplicações: guardar, buscar e exibir.

//2) pilha - controle do último dado inserido. Sistemas operacionais. Jogos. Stack
// em tese a classe stack gerda da classe list, logo possui todos os atributos e metodos de classe pai
// inserir		- push, Push, append
// remover		- pop, Pop, remove
// Aplicações: backup, processos em SO e Jogos

//3) fila - controle de prioridade no atendimento. Queue (FIF0 - First In, First Out)
// Assim como a pilha, Queue herda da classe List.
// inserir		-add, Enqueue, put
// remover		-remove, Dequeue, get_nowait
// Aplicações: gestão de prioridade de processos, atendimento
	//IA há metodos de resolução de problemas:

public class Ex1 {
	
	public static void main (String[] args) {
		ArrayList<String> listaNomes = new ArrayList <String>();
		String nome;
		for (int i = 0 ; i < 5 ; i++) {
			nome = JOptionPane.showInputDialog(null, "Digite um nome: ").toUpperCase();
			
			if (!listaNomes.contains(nome)) {
				listaNomes.add(nome);
				listaNomes.sort(null);
			} else {
				JOptionPane.showMessageDialog(null, "Este nome ja foi cadastrado! ");
			}
		}
		StringBuilder resultado = new StringBuilder();
		for (String item : listaNomes) {
			 resultado.append(item).append("\n");
		}
		JOptionPane.showMessageDialog(null,resultado);
	}
}
