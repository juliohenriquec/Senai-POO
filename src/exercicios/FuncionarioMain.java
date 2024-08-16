package exercicios;

public class FuncionarioMain {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Maria Silva", 5000.0, "Analista de Sistemas");
        System.out.println("Salário Líquido: R$" + funcionario.calcularSalarioLiquido());
    }
}
