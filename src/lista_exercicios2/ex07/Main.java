package lista_exercicios2.ex07;

public class Main {
    public static void main(String[] args) {
        RedeSocial redeSocial = new RedeSocial();

        Usuario alice = new Usuario("Alice");
        Usuario bob = new Usuario("Bob");
        Usuario carol = new Usuario("Carol");

        redeSocial.adicionarUsuario(alice);
        redeSocial.adicionarUsuario(bob);
        redeSocial.adicionarUsuario(carol);

        alice.adicionarAmigo(bob);
        bob.adicionarAmigo(carol);

        Post post1 = alice.publicarMensagem("Olá, mundo!");
        Post post2 = bob.publicarMensagem("Bom dia a todos!");

        alice.comentarNoPost(post2, "Bom dia, Bob!");
        carol.comentarNoPost(post1, "Oi, Alice!");

        Usuario usuarioEncontrado = redeSocial.buscarUsuario("Bob");
        System.out.println(usuarioEncontrado);

        System.out.println(post1);
        System.out.println(post2);
    }
}
