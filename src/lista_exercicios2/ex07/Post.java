package lista_exercicios2.ex07;

import java.util.ArrayList;
import java.util.List;

public class Post {
    private Usuario autor;
    private String mensagem;
    private List<Comentario> comentarios;

    public Post(Usuario autor, String mensagem) {
        this.autor = autor;
        this.mensagem = mensagem;
        this.comentarios = new ArrayList<>();
    }

    public Usuario getAutor() {
        return autor;
    }

    public void adicionarComentario(Usuario usuario, String comentario) {
        comentarios.add(new Comentario(usuario, comentario));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Post por ").append(autor.getNome()).append(": ").append(mensagem).append("\nComentários:\n");
        for (Comentario com : comentarios) {
            sb.append(com.getUsuario().getNome()).append(": ").append(com.getComentario()).append("\n");
        }
        return sb.toString();
    }
}