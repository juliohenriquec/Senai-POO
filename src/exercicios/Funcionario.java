package exercicios;

public class Funcionario {
    private String nome;
    private double salarioBruto;
    private String cargo;

    public Funcionario(String nome, double salarioBruto, String cargo) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.cargo = cargo;
    }

    public double calcularSalarioLiquido() {
        double descontos = calcularDescontos();
        double beneficios = calcularBeneficios();
        return salarioBruto - descontos + beneficios;
    }

    private double calcularDescontos() {
        double impostoDeRenda = salarioBruto * 0.15;
        double inss = salarioBruto * 0.11;
        return impostoDeRenda + inss;
    }

    private double calcularBeneficios() {
        double valeTransporte = 150.0;
        double valeRefeicao = 300.0;
        return valeTransporte + valeRefeicao;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Maria Silva", 5000.0, "Analista de Sistemas");
        System.out.println("Salário Líquido: R$" + funcionario.calcularSalarioLiquido());
    }
}

