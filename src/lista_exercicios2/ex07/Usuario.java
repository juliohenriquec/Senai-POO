package lista_exercicios2.ex07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Usuario {
    private String nome;
    private Set<Usuario> amigos;
    private List<Post> posts;

    public Usuario(String nome) {
        this.nome = nome;
        this.amigos = new HashSet<>();
        this.posts = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarAmigo(Usuario amigo) {
        if (!amigo.equals(this)) {
            amigos.add(amigo);
            amigo.amigos.add(this);
        }
    }

    public Post publicarMensagem(String mensagem) {
        Post post = new Post(this, mensagem);
        posts.add(post);
        return post;
    }

    public void comentarNoPost(Post post, String comentario) {
        if (posts.contains(post) || amigos.contains(post.getAutor())) {
            post.adicionarComentario(this, comentario);
        } else {
            System.out.println(nome + " não pode comentar neste post.");
        }
    }

    @Override
    public String toString() {
        return "Usuário(" + nome + ")";
    }
}









