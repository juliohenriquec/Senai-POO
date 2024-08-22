package lista_exercicios2.ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AgendaTelefonica agenda = new AgendaTelefonica();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nAgenda Telefônica:");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Editar Contato");
            System.out.println("3. Remover Contato");
            System.out.println("4. Buscar Contato");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do contato: ");
                    String nomeAdicionar = scanner.nextLine();
                    System.out.print("Digite o telefone do contato: ");
                    String telefoneAdicionar = scanner.nextLine();
                    System.out.print("Digite o email do contato: ");
                    String emailAdicionar = scanner.nextLine();
                    agenda.adicionarContato(nomeAdicionar, telefoneAdicionar, emailAdicionar);
                    break;
                case 2:
                    System.out.print("Digite o nome do contato a ser editado: ");
                    String nomeEditar = scanner.nextLine();
                    System.out.print("Digite o novo telefone do contato: ");
                    String novoTelefone = scanner.nextLine();
                    System.out.print("Digite o novo email do contato: ");
                    String novoEmail = scanner.nextLine();
                    agenda.editarContato(nomeEditar, novoTelefone, novoEmail);
                    break;
                case 3:
                    System.out.print("Digite o nome do contato a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    agenda.removerContato(nomeRemover);
                    break;
                case 4:
                    System.out.print("Digite o nome do contato a ser buscado: ");
                    String nomeBuscar = scanner.nextLine();
                    agenda.buscarContato(nomeBuscar);
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
