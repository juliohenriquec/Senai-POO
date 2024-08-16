package exercicios;

public class CarroMain {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla");

        carro.acelerar(50.0);
        System.out.println("Velocidade atual: " + carro.getVelocidadeAtual() + " km/h");

        carro.frear(20.0);
        System.out.println("Velocidade atual: " + carro.getVelocidadeAtual() + " km/h");

        carro.frear(50.0);
        System.out.println("Velocidade atual: " + carro.getVelocidadeAtual() + " km/h");
    }
}
