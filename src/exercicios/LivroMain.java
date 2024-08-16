package exercicios;

public class LivroMain {
    public static void main(String[] args) {
        Livro livro = new Livro("1984", "George Orwell", 328);

        if (livro.estaDisponivel()) {
            livro.emprestar();
        }

        livro.emprestar();

        livro.devolver();

        System.out.println("O livro está disponível? " + livro.estaDisponivel());
    }
}
