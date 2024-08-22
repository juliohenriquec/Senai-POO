package lista_exercicios2.ex03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class PlataformaDeVendas {

    private Map<Integer, Produto> produtos;
    private List<ItemCarrinho> carrinho;
    private double desconto;

    public PlataformaDeVendas() {
        this.produtos = new HashMap<>();
        this.carrinho = new ArrayList<>();
        this.desconto = 0.0;
    }

    public void cadastrarProduto(int idProduto, String nome, double preco) {
        produtos.put(idProduto, new Produto(idProduto, nome, preco));
        System.out.println("Produto cadastrado: " + nome + " - Preço: R$" + preco);
    }

    public void adicionarAoCarrinho(int idProduto, int quantidade) {
        Produto produto = produtos.get(idProduto);
        if (produto == null) {
            System.out.println("Produto não encontrado.");
            return;
        }
        carrinho.add(new ItemCarrinho(produto, quantidade));
        System.out.println("Produto " + produto.getNome() + " adicionado ao carrinho. Quantidade: " + quantidade);
    }

    public void aplicarDesconto(double percentual) {
        if (percentual < 0 || percentual > 100) {
            System.out.println("Desconto inválido. Deve estar entre 0 e 100.");
            return;
        }
        this.desconto = percentual;
        System.out.println("Desconto de " + percentual + "% aplicado.");
    }

    public double calcularValorTotal() {
        double total = 0.0;
        for (ItemCarrinho item : carrinho) {
            total += item.getProduto().getPreco() * item.getQuantidade();
        }
        return total * (1 - desconto / 100);
    }

    public void finalizarCompra() {
        double valorTotal = calcularValorTotal();
        System.out.println("Valor total da compra: R$" + valorTotal);
        carrinho.clear();
        desconto = 0.0;
    }


    private class Produto {
        private int id;
        private String nome;
        private double preco;

        public Produto(int id, String nome, double preco) {
            this.id = id;
            this.nome = nome;
            this.preco = preco;
        }

        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }
    }


    private class ItemCarrinho {
        private Produto produto;
        private int quantidade;

        public ItemCarrinho(Produto produto, int quantidade) {
            this.produto = produto;
            this.quantidade = quantidade;
        }

        public Produto getProduto() {
            return produto;
        }

        public int getQuantidade() {
            return quantidade;
        }
    }
}

