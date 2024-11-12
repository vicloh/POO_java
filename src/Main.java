//Victor Lohan Sousa De Assis
//POO 4° periodo

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println(" --Cadastre o livro-- ");
        System.out.println("\nDigite o titulo do livro: ");
        String titulo = scan.nextLine();
        
        System.out.println("\nDigite o autor do livro: ");
        String autor = scan.nextLine();
        
        //Istancia o objeto livro1
        Livro livro1 = new Livro(titulo, autor);
    
        System.out.println("\nInformações do Livro:");
        System.out.println("Título: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("ISBN: " + livro1.getIsbn());
        System.out.println("Disponível: " + (livro1.isDisponivel() ? "Sim" : "Não"));
        int temp;
        
        //Laço de repetição do programa / Menu de opções.
        do{
            System.out.println("\n--Escolha uma opção--");
            System.out.println("1 - Realizar emprestimo do Livro");
            System.out.println("2 - Realizar devolução do Livro");
            System.out.println("3 - Verificar disponibilidade do livro");
            System.out.println("4 - Sair");

            int opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    livro1.emprestarLivro();
                    break;
                case 2:
                    livro1.devolverLivro();
                    break;
                case 3:
                    System.out.println("Disponível: "+
                    (livro1.isDisponivel() ? "Sim" : "Não")
                    );
                    break;
                case 4:
                    System.out.println("Obrigado por usar o programa ;)");
                    return;
                default:
                    System.out.println("Opção inválida! Digite uma das opções acima. ");
            }

            System.out.print("Deseja continuar?\nDigite 1 para continuar ou 0 para sair do programa: ");
            temp = scan.nextInt();
            for (int i = 0; i < 100; ++i) System.out.println();
            
        }while(temp==1);
        scan.close();
    }
}