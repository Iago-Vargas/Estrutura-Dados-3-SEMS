package hashCode;
import java.util.ArrayList; //Declaramos a ArrayList
import java.util.Scanner; //Declaramos o scanner

//Trabalho Iago Vargas de Oliveira

public class Main {
    public static void main(String[] args) {
        ArrayList<Atleta> listaAtletas = new ArrayList<>(); //Criamo a lista chamada listaAtletas
        Scanner scanner = new Scanner(System.in);

        int opcao; //criamos a variavel da opção do menu
        do {
            exibirMenu(); //Chamamos o void
            opcao = scanner.nextInt(); //Scanneamos
            scanner.nextLine(); //Limpeza de buffer

            switch (opcao) { //Switch para definimos as opções
                case 1:
                    listarAtletas(listaAtletas); //Chamamos o void 
                    break; //Encerramento de case
                case 2:
                    cadastrarAtleta(listaAtletas, scanner); //Chamamos o void 
                    break;//Encerramento de case
                case 3:
                    procurarAtleta(listaAtletas, scanner); //Chamamos o void 
                    break;//Encerramento de case
                case 4:
                    removerAtleta(listaAtletas, scanner); //Chamamos o void 
                    break;//Encerramento de case
                case 0:
                    System.out.println("Programa encerrado."); //Encerramento do programa 
                    break;//Encerramento de case
                default: //Aqui caso a pessoa coloque uma opção que nao existe
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0); //Qual numero diferente de 0 sai do loop
    }

    private static void exibirMenu() { //Menu do nosso programa
        System.out.println("Menu");
        System.out.println("1 - Listar atletas");
        System.out.println("2 - Cadastrar atleta");
        System.out.println("3 - Procurar por atleta");
        System.out.println("4 - Remover atleta");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void listarAtletas(ArrayList<Atleta> listaAtletas) { //Private para definiar que somente a classe acesse, declaramos a listaAtletas
        if (listaAtletas.isEmpty()) { //Verificamos se a lista esta vazia
            System.out.println("Nenhum atleta cadastrado."); //Mensagem caso esteja
        } else {
            System.out.println("Lista de Atletas:"); //Caso esteja com nome mostramos ela:
            for (Atleta atleta : listaAtletas) { //For ate onde possuir atletas ele mostra
                System.out.println(atleta); //Mostramos os atletas
            }
        }
    }

    private static void cadastrarAtleta(ArrayList<Atleta> listaAtletas, Scanner scanner) { //Private para definiar que somente a classe acesse, declaramos a listaAtletas
        System.out.print("Digite o fone do atleta: "); 
        String fone = scanner.nextLine(); //Salvamos o fone do atleta 
        System.out.print("Digite o nome do atleta: ");
        String nome = scanner.nextLine(); //Agora seu nome
        System.out.print("Digite o apelido do atleta: ");
        String apelido = scanner.nextLine(); //Seu apelido
        System.out.print("Digite a data de nascimento do atleta: ");
        String dataNascimento = scanner.nextLine(); //Sua data de nascimento
        System.out.print("Digite a pontuação acumulada do atleta: ");
        int pontuacaoAcumulada = scanner.nextInt(); //Sua pontuação
        scanner.nextLine(); //Limpeza de buffer

        Atleta novoAtleta = new Atleta(fone, nome, apelido, dataNascimento, pontuacaoAcumulada); //Declaramos a classe e suas variaveis
        listaAtletas.add(novoAtleta); //Adicionamos o novo atleta na listaAtletas
        System.out.println("Atleta cadastrado com sucesso.");
    }

    private static void procurarAtleta(ArrayList<Atleta> listaAtletas, Scanner scanner) { //Private para definiar que somente a classe acesse, declaramos a listaAtletas
        System.out.print("Digite o fone do atleta: "); //Digitamos a nossa chave primaria
        String buscaFone = scanner.nextLine(); //Scanneamos
        boolean encontrado = false;  // declaramos como false o encontrado

        for (Atleta atleta : listaAtletas) { //Este loop for-each vai percorrer todos elementos da lista
            if (atleta.getFone().equalsIgnoreCase(buscaFone)) { //Aqui se o fone for igual ao digitado vai entrar no if
                System.out.println(atleta); //exibimos o atleta
                encontrado = true; //Declaramos como verdadeiro
            }
        }

        if (!encontrado) { //Se for false entao entra nesse laço
            System.out.println("Atleta não encontrado."); //declara que nao possui na lista
        }
    }

    private static void removerAtleta(ArrayList<Atleta> listaAtletas, Scanner scanner) { //Private para definiar que somente a classe acesse, declaramos a listaAtletas
        System.out.print("Digite o fone do atleta a ser removido: "); //Digitamos o fone do atleta que vai ser removido
        String buscaFone = scanner.nextLine(); //scanneamos o telefone
        boolean removido = false; //Declaramos como falso o removido

        for (Atleta atleta : listaAtletas) { //Usamos novamente o for-each que vai percorrer toda lista
            if (atleta.getFone().equalsIgnoreCase(buscaFone)) { //Se o telefone digitado existir na lista ele vai entrar no if
                listaAtletas.remove(atleta); //Removendo ele da lista
                System.out.println("Atleta removido com sucesso.");
                removido = true; //Removido vai passar a ser verdadeiro
                break; //Encerramento de laço
            }
        }

        if (!removido) { //Caso nao for encontrado vamos nesse laço 
            System.out.println("Atleta não encontrado."); //Declara q nao foi encontrado
        }
    }
}
//Começo = Dia 26/04/2024
//Termino = Dia 02/05/2024
//Trabalho Iago Vargas de Oliveira