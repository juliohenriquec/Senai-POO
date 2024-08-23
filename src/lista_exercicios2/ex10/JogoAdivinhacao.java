package lista_exercicios2.ex10;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    private int numeroParaAdivinhar;
    private int tentativas;
    private static final int INTERVALO_INICIAL = 1;
    private static final int INTERVALO_FINAL = 100;

    public JogoAdivinhacao() {
        Random random = new Random();
        this.numeroParaAdivinhar = random.nextInt(INTERVALO_FINAL - INTERVALO_INICIAL + 1) + INTERVALO_INICIAL;
        this.tentativas = 0;
    }

    public void jogar() {
        Scanner scanner = new Scanner(System.in);
        boolean acertou = false;
        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número entre " + INTERVALO_INICIAL + " e " + INTERVALO_FINAL + ":");

        while (!acertou) {
            System.out.print("Digite seu palpite: ");
            int palpite = scanner.nextInt();
            tentativas++;

            if (palpite < INTERVALO_INICIAL || palpite > INTERVALO_FINAL) {
                System.out.println("Palpite fora do intervalo! Por favor, digite um número entre " + INTERVALO_INICIAL + " e " + INTERVALO_FINAL + ".");
            } else if (palpite < numeroParaAdivinhar) {
                System.out.println("O número é maior do que " + palpite + ". Tente novamente.");
            } else if (palpite > numeroParaAdivinhar) {
                System.out.println("O número é menor do que " + palpite + ". Tente novamente.");
            } else {
                acertou = true;
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
            }
        }
        scanner.close();
    }
}
