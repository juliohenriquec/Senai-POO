package exercicios;

public class Carro {
    private String marca;
    private String modelo;
    private double velocidadeAtual;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeAtual = 0.0; // Inicialmente, a velocidade é 0
    }

    public void acelerar(double incremento) {
        if (incremento > 0) {
            velocidadeAtual += incremento;
            System.out.println("O carro acelerou. Velocidade atual: " + velocidadeAtual + " km/h");
        } else {
            System.out.println("Valor de aceleração inválido.");
        }
    }

    public void frear(double decremento) {
        if (decremento > 0) {
            velocidadeAtual -= decremento;
            if (velocidadeAtual < 0) {
                velocidadeAtual = 0; // A velocidade não pode ser negativa
            }
            System.out.println("O carro freou. Velocidade atual: " + velocidadeAtual + " km/h");
        } else {
            System.out.println("Valor de frenagem inválido.");
        }
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

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

