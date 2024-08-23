package lista_exercicios2.ex07;

public class Comentario {
    private Usuario usuario;
    private String comentario;

    public Comentario(Usuario usuario, String comentario) {
        this.usuario = usuario;
        this.comentario = comentario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getComentario() {
        return comentario;
    }
}