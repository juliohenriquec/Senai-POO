package lista_exercicios2.ex05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class MaquinaDeVendas {

    private Map<String, Produto> estoque;
    private double saldoAtual;
    private double valorInserido;

    public MaquinaDeVendas() {
        this.estoque = new HashMap<>();
        this.saldoAtual = 0.0;
        this.valorInserido = 0.0;
    }

    // Adiciona um produto ao estoque
    public void cadastrarProduto(String nome, double preco, int quantidade) {
        if (estoque.containsKey(nome)) {
            Produto produto = estoque.get(nome);
            produto.setQuantidade(produto.getQuantidade() + quantidade);
            produto.setPreco(preco); // Atualiza o preço se necessário
        } else {
            estoque.put(nome, new Produto(nome, preco, quantidade));
        }
        System.out.println("Produto cadastrado: " + nome + " - Preço: R$" + preco + " - Quantidade: " + quantidade);
    }

    // Exibe o estoque
    public void exibirEstoque() {
        System.out.println("Estoque:");
        for (Produto produto : estoque.values()) {
            System.out.println(produto);
        }
    }

    // Seleciona um produto para compra
    public void selecionarProduto(String nome, double valorInserido) {
        Produto produto = estoque.get(nome);
        if (produto == null) {
            System.out.println("Produto não encontrado.");
            return;
        }
        if (produto.getQuantidade() <= 0) {
            System.out.println("Produto fora de estoque.");
            return;
        }
        if (valorInserido < produto.getPreco()) {
            System.out.println("Valor inserido insuficiente.");
            return;
        }

        // Processa a compra
        this.valorInserido = valorInserido;
        double troco = valorInserido - produto.getPreco();
        produto.setQuantidade(produto.getQuantidade() - 1); // Decrementa a quantidade do estoque
        this.saldoAtual += produto.getPreco();

        // Exibe o troco
        System.out.println("Compra realizada com sucesso!");
        System.out.println("Troco: R$" + troco);
    }

    // Retorna o troco
    public void retornarTroco() {
        System.out.println("Troco retornado: R$" + valorInserido);
        valorInserido = 0.0;
    }

    // Classe interna para representar um produto
    private class Produto {
        private String nome;
        private double preco;
        private int quantidade;

        public Produto(String nome, double preco, int quantidade) {
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }

        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }

        @Override
        public String toString() {
            return "Nome: " + nome + ", Preço: R$" + preco + ", Quantidade: " + quantidade;
        }
    }
}
