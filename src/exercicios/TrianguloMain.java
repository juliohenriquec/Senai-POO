package exercicios;

public class TrianguloMain {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(3.0, 4.0, 5.0);

        if (triangulo.ehTrianguloValido()) {
            System.out.println("Área do triângulo: " + triangulo.calcularArea());
        } else {
            System.out.println("Não é um triângulo válido.");
        }
    }
}
