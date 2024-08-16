package exercicios;

public class CirculoMain {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);

        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());
    }
}

