package lista_exercicios2.ex05;

import java.util.Scanner;

public class Main {
    // Exemplo de uso
    public static void main(String[] args) {
        MaquinaDeVendas maquina = new MaquinaDeVendas();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMáquina de Vendas:");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Exibir Estoque");
            System.out.println("3. Comprar Produto");
            System.out.println("4. Retornar Troco");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nomeProduto = scanner.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    double precoProduto = scanner.nextDouble();
                    System.out.print("Digite a quantidade do produto: ");
                    int quantidadeProduto = scanner.nextInt();
                    scanner.nextLine();  // Consumir a nova linha
                    maquina.cadastrarProduto(nomeProduto, precoProduto, quantidadeProduto);
                    break;
                case 2:
                    maquina.exibirEstoque();
                    break;
                case 3:
                    System.out.print("Digite o nome do produto: ");
                    String nomeParaCompra = scanner.nextLine();
                    System.out.print("Digite o valor inserido: ");
                    double valorInserido = scanner.nextDouble();
                    scanner.nextLine();  // Consumir a nova linha
                    maquina.selecionarProduto(nomeParaCompra, valorInserido);
                    break;
                case 4:
                    maquina.retornarTroco();
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
