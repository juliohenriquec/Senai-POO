package exercicios;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private boolean emprestado;

    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.emprestado = false; // O livro é inicialmente disponível
    }

    public boolean emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("O livro \"" + titulo + "\" foi emprestado.");
            return true;
        } else {
            System.out.println("O livro \"" + titulo + "\" já está emprestado.");
            return false;
        }
    }

    public boolean devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("O livro \"" + titulo + "\" foi devolvido.");
            return true;
        } else {
            System.out.println("O livro \"" + titulo + "\" não estava emprestado.");
            return false;
        }
    }

    public boolean estaDisponivel() {
        return !emprestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

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

