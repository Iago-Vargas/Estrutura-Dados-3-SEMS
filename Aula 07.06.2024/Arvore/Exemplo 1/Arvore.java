package Exemplo1;
import javax.swing.*;
import java.util.TreeSet;
public class Arvore {
	public static void main (String [] args) {
		  TreeSet<Aluno> arvore = new TreeSet<>();

	        //arvore.add(new Aluno(100,"Viti"));
	        //arvore.add(new Aluno(5,"Matheus"));
	        //arvore.add(new Aluno(5,"Romeo"));
	        //arvore.add(new Aluno(1,"Iago"));
	        //arvore.add(new Aluno(15,"Arthur"));
		  	int matricula;
		  	String nome;
		  	Aluno aluno;
		  	for (int i = 0 ; i < 5 ; i++) {
		  		matricula = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe Matricula: "));
		  		nome = JOptionPane.showInputDialog(null, "Digite Nome: ").toUpperCase();
		  		aluno = new Aluno (matricula, nome);
		  		
		  		if(!arvore.contains(aluno)) {
		  			arvore.add(aluno);
		  		}
		  		else {
		  			JOptionPane.showMessageDialog (null, "Aluno já cadastrado com essa matricula");
		  			System.gc();
		  		}
		  	}
		  	for (Aluno item : arvore) {
		  		System.out.println (item);
		  	}
	       // for (Aluno aluno : arvore) {
	        	//System.out.println (aluno);
	        //}

	}
}
