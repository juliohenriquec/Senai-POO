package lista_exercicios2.ex08;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class BibliotecaVirtual {

    private Map<String, Livro> acervo;
    private Map<String, Livro> emprestados;

    public BibliotecaVirtual() {
        this.acervo = new HashMap<>();
        this.emprestados = new HashMap<>();
    }

    public void cadastrarLivro(String titulo, String autor) {
        if (acervo.containsKey(titulo)) {
            System.out.println("Livro já cadastrado.");
        } else {
            acervo.put(titulo, new Livro(titulo, autor));
            System.out.println("Livro cadastrado: " + titulo + " por " + autor);
        }
    }

    public void emprestarLivro(String titulo) {
        Livro livro = acervo.get(titulo);
        if (livro == null) {
            System.out.println("Livro não encontrado no acervo.");
        } else if (emprestados.containsKey(titulo)) {
            System.out.println("Livro já emprestado.");
        } else {
            emprestados.put(titulo, livro);
            System.out.println("Livro emprestado: " + titulo);
        }
    }

    public void devolverLivro(String titulo) {
        Livro livro = emprestados.remove(titulo);
        if (livro == null) {
            System.out.println("Livro não encontrado entre os emprestados.");
        } else {
            acervo.put(titulo, livro);
            System.out.println("Livro devolvido: " + titulo);
        }
    }

    public void verificarDisponibilidade(String titulo) {
        if (acervo.containsKey(titulo)) {
            if (emprestados.containsKey(titulo)) {
                System.out.println("Livro está emprestado.");
            } else {
                System.out.println("Livro disponível.");
            }
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    private class Livro {
        private String titulo;
        private String autor;

        public Livro(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }

        @Override
        public String toString() {
            return titulo + " por " + autor;
        }
    }
}
