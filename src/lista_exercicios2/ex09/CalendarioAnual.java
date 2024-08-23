package lista_exercicios2.ex09;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.Set;

public class CalendarioAnual {
    private LocalDate ano;
    private Set<LocalDate> feriados;

    public CalendarioAnual(int ano) {
        this.ano = LocalDate.of(ano, 1, 1);
        this.feriados = new HashSet<>();
    }

    // Adiciona um feriado ao calendário
    public void adicionarFeriado(int dia, Month mes) {
        LocalDate dataFeriado = LocalDate.of(ano.getYear(), mes, dia);
        feriados.add(dataFeriado);
    }

    // Exibe o calendário de um mês específico
    public void exibirCalendarioDoMes(Month mes) {
        LocalDate primeiroDiaDoMes = LocalDate.of(ano.getYear(), mes, 1);
        int ultimoDiaDoMes = primeiroDiaDoMes.withDayOfMonth(primeiroDiaDoMes.lengthOfMonth()).getDayOfMonth();

        System.out.println("Calendário de " + mes + " " + ano.getYear());
        System.out.println("Su Mo Tu We Th Fr Sa Su");

        // Ajusta o início do mês para o dia da semana correto
        LocalDate dataAtual = primeiroDiaDoMes;
        int primeiroDiaSemana = dataAtual.getDayOfWeek().getValue(); // Segunda-feira é 1, Domingo é 7

        // Preenche os dias anteriores ao primeiro dia do mês com espaços
        for (int i = 1; i < primeiroDiaSemana; i++) {
            System.out.print("   ");
        }

        // Imprime os dias do mês
        for (int dia = 1; dia <= ultimoDiaDoMes; dia++) {
            if (dia < 10) {
                System.out.print(" " + dia + " ");
            } else {
                System.out.print(dia + " ");
            }

            // Quebra de linha após o sábado
            if ((primeiroDiaSemana + dia - 1) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    // Verifica se uma data é um feriado
    public boolean verificarFeriado(LocalDate data) {
        return feriados.contains(data);
    }

    // Calcula a diferença de dias entre duas datas
    public long calcularDiferencaDias(LocalDate data1, LocalDate data2) {
        return ChronoUnit.DAYS.between(data1, data2);
    }
}
