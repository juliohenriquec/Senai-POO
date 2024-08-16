package exercicios;

public class ProdutoMain {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Ana Souza", 30);

        paciente.adicionarConsulta("Consulta de rotina - 12/01/2024");
        paciente.adicionarConsulta("Exame de sangue - 05/02/2024");

        paciente.exibirConsultas();
    }
}
