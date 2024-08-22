package lista_exercicios2.ex06;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class JogoDeCartas {

    private List<Carta> baralho;
    private List<Jogador> jogadores;
    private int numCartasPorJogador;

    public JogoDeCartas(int numJogadores, int numCartasPorJogador) {
        this.numCartasPorJogador = numCartasPorJogador;
        this.jogadores = new ArrayList<>();
        this.baralho = criarBaralho();
        distribuirCartas(numJogadores);
    }

    private List<Carta> criarBaralho() {
        List<Carta> baralho = new ArrayList<>();
        String[] naipes = {"Copas", "Ouros", "Espadas", "Paus"};
        for (String naipe : naipes) {
            for (int valor = 1; valor <= 13; valor++) {
                baralho.add(new Carta(valor, naipe));
            }
        }
        Collections.shuffle(baralho);
        return baralho;
    }

    private void distribuirCartas(int numJogadores) {
        for (int i = 1; i <= numJogadores; i++) {
            Jogador jogador = new Jogador("Jogador " + i);
            for (int j = 0; j < numCartasPorJogador; j++) {
                if (!baralho.isEmpty()) {
                    jogador.adicionarCarta(baralho.remove(0));
                }
            }
            jogadores.add(jogador);
        }
    }

    public void realizarJogada() {
        for (Jogador jogador : jogadores) {
            System.out.println(jogador.getNome() + ": " + jogador.exibirCartas());
        }
    }

    private class Carta {
        private int valor;
        private String naipe;

        public Carta(int valor, String naipe) {
            this.valor = valor;
            this.naipe = naipe;
        }

        @Override
        public String toString() {
            String valorStr;
            switch (valor) {
                case 1:
                    valorStr = "Ás";
                    break;
                case 11:
                    valorStr = "Valete";
                    break;
                case 12:
                    valorStr = "Dama";
                    break;
                case 13:
                    valorStr = "Rei";
                    break;
                default:
                    valorStr = String.valueOf(valor);
                    break;
            }
            return valorStr + " de " + naipe;
        }
    }

    private class Jogador {
        private String nome;
        private List<Carta> cartas;

        public Jogador(String nome) {
            this.nome = nome;
            this.cartas = new ArrayList<>();
        }

        public String getNome() {
            return nome;
        }

        public void adicionarCarta(Carta carta) {
            cartas.add(carta);
        }

        public List<Carta> getCartas() {
            return cartas;
        }

        public String exibirCartas() {
            return cartas.toString();
        }
    }
}
