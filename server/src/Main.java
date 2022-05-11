
import java.util.Scanner;

public class Main {
    
    Controle controleGeral = new Controle();

    public static void main(String[] args) {
     
        

        Scanner sc = new Scanner(System.in);
        menu();
        int opcao = sc.nextInt();

        while (opcao != 0) {
            switch (opcao) {
                case 1:
                    System.out.println("Informe o nome do usuário: ");
                    String nome = sc.next();
                    System.out.println("Informe o tipo de usuário: ");
                    String tipo = sc.next();
                    controleGeral.criarUsuario(nome, tipo);
                    break;
                case 2:
                    System.out.println("Informe o nome do usuário: ");
                
                    break;
                case 3:
                
                    break;
                case 4:
                    break;

                case 5:
                    break;
                case 6:
                    opcao = 0;
                    break;
                default:  System.out.println("Opção Inválida!");
                    break;
            }
        }

    }




    public static void menu() {
        System.out.println("Bem vindo! \n Escolha a opção desejada: ");
        System.out.println("1 - Cadastrar Usuário \n2 - Criar publicação\n3- Fazer comentário \n4 - Escluir Publicação");
        System.out.println("5 - Excluir comentário");
    }
}