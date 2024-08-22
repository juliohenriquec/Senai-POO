package lista_exercicios2.ex02;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();


        banco.cadastrarCliente("João Silva", "12345678900");
        banco.cadastrarCliente("Maria Oliveira", "09876543211");


        banco.abrirConta("12345678900");
        banco.abrirConta("09876543211");


        Conta contaJoao = banco.getConta(1);
        contaJoao.depositar(1000);
        contaJoao.sacar(500);

        Conta contaMaria = banco.getConta(2);
        contaMaria.depositar(1500);
        contaMaria.sacar(200);
    }
}
