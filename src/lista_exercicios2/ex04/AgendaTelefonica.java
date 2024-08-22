package lista_exercicios2.ex04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class AgendaTelefonica {

    private Map<String, Contato> contatos;

    public AgendaTelefonica() {
        this.contatos = new HashMap<>();
    }

    // Adiciona um novo contato
    public void adicionarContato(String nome, String telefone, String email) {
        if (contatos.containsKey(nome)) {
            System.out.println("Contato já existe. Use o método editarContato para atualizar as informações.");
        } else {
            contatos.put(nome, new Contato(nome, telefone, email));
            System.out.println("Contato adicionado: " + nome);
        }
    }

    // Edita um contato existente
    public void editarContato(String nome, String novoTelefone, String novoEmail) {
        Contato contato = contatos.get(nome);
        if (contato != null) {
            contato.setTelefone(novoTelefone);
            contato.setEmail(novoEmail);
            System.out.println("Contato atualizado: " + nome);
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    // Remove um contato
    public void removerContato(String nome) {
        if (contatos.remove(nome) != null) {
            System.out.println("Contato removido: " + nome);
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    // Busca um contato
    public void buscarContato(String nome) {
        Contato contato = contatos.get(nome);
        if (contato != null) {
            System.out.println("Contato encontrado: " + contato);
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    // Classe interna para representar um contato
    private class Contato {
        private String nome;
        private String telefone;
        private String email;

        public Contato(String nome, String telefone, String email) {
            this.nome = nome;
            this.telefone = telefone;
            this.email = email;
        }

        public String getNome() {
            return nome;
        }

        public String getTelefone() {
            return telefone;
        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public String toString() {
            return "Nome: " + nome + ", Telefone: " + telefone + ", Email: " + email;
        }
    }
}

