package lista_exercicios2.ex06;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de jogadores: ");
        int numJogadores = scanner.nextInt();
        System.out.print("Digite o número de cartas por jogador: ");
        int numCartasPorJogador = scanner.nextInt();
        scanner.nextLine();  // Consumir a nova linha

        JogoDeCartas jogo = new JogoDeCartas(numJogadores, numCartasPorJogador);
        jogo.realizarJogada();

        scanner.close();
    }
}
