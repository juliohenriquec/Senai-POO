package lista_exercicios2.ex08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BibliotecaVirtual biblioteca = new BibliotecaVirtual();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nBiblioteca Virtual:");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Emprestar Livro");
            System.out.println("3. Devolver Livro");
            System.out.println("4. Verificar Disponibilidade");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título do livro: ");
                    String tituloCadastro = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autorCadastro = scanner.nextLine();
                    biblioteca.cadastrarLivro(tituloCadastro, autorCadastro);
                    break;
                case 2:
                    System.out.print("Digite o título do livro para emprestar: ");
                    String tituloEmprestimo = scanner.nextLine();
                    biblioteca.emprestarLivro(tituloEmprestimo);
                    break;
                case 3:
                    System.out.print("Digite o título do livro para devolver: ");
                    String tituloDevolucao = scanner.nextLine();
                    biblioteca.devolverLivro(tituloDevolucao);
                    break;
                case 4:
                    System.out.print("Digite o título do livro para verificar disponibilidade: ");
                    String tituloVerificacao = scanner.nextLine();
                    biblioteca.verificarDisponibilidade(tituloVerificacao);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
