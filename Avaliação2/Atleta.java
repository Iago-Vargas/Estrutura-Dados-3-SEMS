package hashCode;
import java.util.Objects;

//Trabalho Iago Vargas de Oliveira

public class Atleta {
    private String fone; //Utilizamos Fone como chave Primaria para localizar o 'Atleta'
    private String nome; //Fiz o cadastro do nome do atleta
    private String apelido; //Apelido
    private String dataNascimento; //Sua data de nascimento
    private int pontuacaoAcumulada; //E sua pontuação por ultimo

   
    public Atleta(String fone, String nome, String apelido, String dataNascimento, int pontuacaoAcumulada) {
        this.fone = fone; //Faço a declaração central de todos atributos
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.pontuacaoAcumulada = pontuacaoAcumulada;
    }

    // Getters e Setters
    public String getFone() { // Utilizo o get para retornar a String Fone
        return fone;
    }

    public void setFone(String fone) { //Utilizamos o set para setar o fone do atleta
        this.fone = fone;
    }

    public String getNome() { // Utilizo o get para retornar a String nome
        return nome;
    }

    public void setNome(String nome) { //Utilizamos o set para setar o nome do atleta
        this.nome = nome;
    }

    public String getApelido() { // Utilizo o get para retornar a String apelido
        return apelido;
    }

    public void setApelido(String apelido) { //Utilizamos o set para setar o Apelido do atleta
        this.apelido = apelido;
    }

    public String getDataNascimento() { // Utilizo o get para retornar a String Data de nascimento
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) { //Utilizamos o set para setar a data de nascimento do atleta
        this.dataNascimento = dataNascimento;
    }

    public int getPontuacaoAcumulada() { // Utilizo o int para retornar a pontuação
        return pontuacaoAcumulada;
    }

    public void setPontuacaoAcumulada(int pontuacaoAcumulada) { //Utilizamos o set para setar o pontuação do atleta
        this.pontuacaoAcumulada = pontuacaoAcumulada;
    }

   
    @Override
    public String toString() { //Usamos o toString para mostrar a representação no formato de string, mostrar tudo em forma legivel, mostrando os dados de forma legiveis e entendimento rapido
        return "Atleta{" +
                "fone='" + fone + '\'' +
                ", nome='" + nome + '\'' +
                ", apelido='" + apelido + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", pontuacaoAcumulada=" + pontuacaoAcumulada +
                '}';
    }

  
    @Override
    public boolean equals(Object o) { //Usamos o boolean para determinar se o objeto da listaAtleta são iguais ao determinados
        if (this == o) return true; //Verificamos se o objeto é igual ao determinado pelo usuario, se for vai retornar TRUE
        if (o == null || getClass() != o.getClass()) return false; //vemos se o é nulo e se não forem iguais retornamos FALSE
        Atleta atleta = (Atleta) o; //Se nenhuma das opçãop  for atendidas ele converte o objeto para um objeto da classe 'Atleta' e compara o atributo fone do objeto atual ('this.fone'), se fone forem iguais entao retorna true
        return Objects.equals(fone, atleta.fone);
    }

    @Override 
    public int hashCode() { //Calculamos o codigo hash do objeto com base no valor do fone, com hash melhoramos a eficiencia de operações de busca
        return Objects.hash(fone);
    }
}

//Começo = Dia 26/04/2024
//Termino = Dia 02/05/2024
//Trabalho Iago Vargas de Oliveira