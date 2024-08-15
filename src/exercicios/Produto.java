package exercicios;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public double calcularValorTotalEmEstoque() {
        return preco * quantidadeEmEstoque;
    }

    public boolean estaDisponivel() {
        return quantidadeEmEstoque > 0;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 2500.0, 10);

        System.out.println("Valor total em estoque: R$" + produto.calcularValorTotalEmEstoque());

        if (produto.estaDisponivel()) {
            System.out.println("Produto disponível em estoque.");
        } else {
            System.out.println("Produto indisponível.");
        }
    }
}

