package lista_exercicios2.ex09;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        CalendarioAnual calendario = new CalendarioAnual(2024);

        calendario.adicionarFeriado(1, Month.JANUARY); // Ano Novo
        calendario.adicionarFeriado(25, Month.DECEMBER); // Natal

        calendario.exibirCalendarioDoMes(Month.JULY);

        LocalDate dataParaVerificar = LocalDate.of(2024, Month.DECEMBER, 25);
        System.out.println("O dia " + dataParaVerificar + " é um feriado? " + calendario.verificarFeriado(dataParaVerificar));

        LocalDate data1 = LocalDate.of(2024, Month.JANUARY, 1);
        LocalDate data2 = LocalDate.of(2024, Month.DECEMBER, 31);
        long diasEntreDatas = calendario.calcularDiferencaDias(data1, data2);
        System.out.println("Diferença em dias entre " + data1 + " e " + data2 + ": " + diasEntreDatas);
    }
}
