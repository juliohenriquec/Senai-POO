package exercicios;

public class AlunoMain {
    public static void main(String[] args) {
        double[] notas = {8.5, 7.0, 6.5};
        Aluno aluno = new Aluno("João Silva", "123456", notas);

        System.out.println("Média: " + aluno.calcularMedia());
        System.out.println("Situação: " + aluno.verificarSituacao());
    }
}
