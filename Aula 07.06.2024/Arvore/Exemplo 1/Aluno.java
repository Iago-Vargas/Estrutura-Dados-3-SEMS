package Exemplo1;

class Aluno implements Comparable<Aluno>{
	private int matricula;
	private String nome;
	public Aluno (int matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}
	
    @Override
    public int compareTo(Aluno o) {
        if (this.matricula < o.matricula)
            return -1;
        return 1;
    }

    @Override
    public String toString() {
        return "Aluno [matricula: " + matricula + ", nome: " + nome + "]";
    }
}
