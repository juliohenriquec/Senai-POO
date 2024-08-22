package lista_exercicios2.ex03;

public class Main {
    public static void main(String[] args) {
        PlataformaDeVendas plataforma = new PlataformaDeVendas();
        plataforma.cadastrarProduto(1, "Camiseta", 49.90);
        plataforma.cadastrarProduto(2, "Calça Jeans", 99.90);
        plataforma.adicionarAoCarrinho(1, 2);
        plataforma.adicionarAoCarrinho(2, 1);
        plataforma.aplicarDesconto(10);
        plataforma.finalizarCompra();
    }
}
