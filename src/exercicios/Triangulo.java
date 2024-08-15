package exercicios;

public class Triangulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public boolean ehTrianguloValido() {
        return (ladoA + ladoB > ladoC) &&
                (ladoA + ladoC > ladoB) &&
                (ladoB + ladoC > ladoA);
    }

    public double calcularArea() {
        if (ehTrianguloValido()) {
            double semiPerimetro = (ladoA + ladoB + ladoC) / 2;
            return Math.sqrt(semiPerimetro *
                    (semiPerimetro - ladoA) *
                    (semiPerimetro - ladoB) *
                    (semiPerimetro - ladoC));
        } else {
            System.out.println("Os lados fornecidos não formam um triângulo válido.");
            return 0;
        }
    }

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(3.0, 4.0, 5.0);

        if (triangulo.ehTrianguloValido()) {
            System.out.println("Área do triângulo: " + triangulo.calcularArea());
        } else {
            System.out.println("Não é um triângulo válido.");
        }
    }
}

