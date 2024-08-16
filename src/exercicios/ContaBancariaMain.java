package exercicios;

public class ContaBancariaMain {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(12345-6, "João Silva", 1000.0);

        conta.depositar(500.0);

        conta.sacar(200.0);

        System.out.println("Saldo atual: R$" + conta.getSaldo());
    }
}
