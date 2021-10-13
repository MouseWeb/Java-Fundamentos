package date;

import java.text.ParseException;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class NovaAPIDataHoraJava {
	
	public static void main(String[] args) throws ParseException {
	
	  /*Nova API de data a partir do Java 8*/
		
		LocalDate dataAtual = LocalDate.now();
		
		System.out.println("Data Atual : " + dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		LocalTime hotaAtual = LocalTime.now();
		
		System.out.println("Hora atual : " + hotaAtual.format(DateTimeFormatter.ofPattern("HH:mm:ss")));

		LocalDateTime dataAtualHoralAtual = LocalDateTime.now();
		
		System.out.println("Data e hora atual : " + dataAtualHoralAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));


		System.out.println("---------------------------------");
		System.out.println("criação de datas com a nova classe LocalDate");
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		System.out.println("Dia da semana: " + localDate.getDayOfWeek().name());
		System.out.println("Dia da semana: " + localDate.getDayOfWeek().ordinal());
		System.out.println("Mes: " + localDate.getMonthValue());
		System.out.println("Mes: " + localDate.getMonth().name());
		System.out.println("Ano: " + localDate.getYear());


		System.out.println("---------------------------------");
		System.out.println(" comparação entre diferentes instantes de tempo");
		Instant iInicial = Instant.now();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Instant iFinal = Instant.now();

		Duration duracao = Duration.between(iInicial, iFinal);
		System.out.println("Duração em nanos segundos: " + duracao.toNanos());
		System.out.println("Duração em minutos: " + duracao.toMinutes());
		System.out.println("Duração em horas: " + duracao.toHours());
		System.out.println("Duração em milisegundos: " + duracao.toMillis());
		System.out.println("Duração em dias: " + duracao.toDays());


		System.out.println("---------------------------------");
		System.out.println("comparação de datas (antes, depois, período entre duas datas)");
		LocalDate localDateAntigo = LocalDate.of(2010, 3, 7);
		LocalDate localDateNovo = LocalDate.of(2015, 3, 5);

		System.out.println(localDateAntigo.isAfter(localDateNovo));
		System.out.println(localDateAntigo.isBefore(localDateNovo));
		System.out.println(localDateAntigo.isEqual(localDateNovo));

		Period periodo = Period.between(localDateAntigo, localDateNovo);
		System.out.println(periodo.getYears() + " Anos " + periodo.getMonths()
				+ " Meses " + periodo.getDays() + " Dias");
		System.out.println("Apenas meses: " + periodo.toTotalMonths());


		System.out.println("---------------------------------");
		System.out.println("operações em datas como adição e subtração de dias, meses e anos)");
		LocalDate dataManipulacao = LocalDate.now();
		System.out.println("Mais 5 dias: " + dataManipulacao.plusDays(5));
		System.out.println("Mais 5 semanas: " + dataManipulacao.plusWeeks(5));
		System.out.println("Mais 5 anos: " + dataManipulacao.plusYears(5));
		System.out.println("Mais 2 meses: " + dataManipulacao.plusMonths(2));
		System.out.println("Menos 1 ano: " + dataManipulacao.minusYears(1));
		System.out.println("Menos 1 mês: " + dataManipulacao.minusMonths(1));
		System.out.println("Menos 3 dia: " + dataManipulacao.minusDays(3));


		System.out.println("---------------------------------");
		System.out.println("classe LocalDate é imutável");
		System.out.println("Data Original: " + dataManipulacao);


		System.out.println("---------------------------------");
		System.out.println("comparação de datas utilizando o fuso horário");
		LocalDateTime hora = LocalDateTime.of(2016, Month.APRIL, 4, 22, 30);

		ZoneId fusoHorarioDeSaoPaulo = ZoneId.of("America/Sao_Paulo");
		ZonedDateTime horaSaoPaulo = ZonedDateTime.of(hora, fusoHorarioDeSaoPaulo);
		System.out.println(horaSaoPaulo);

		ZoneId fusoHorarioDeParis = ZoneId.of("Europe/Paris");
		ZonedDateTime horaParis = ZonedDateTime.of(hora, fusoHorarioDeParis);
		System.out.println(horaParis);

		Duration diferencaDeHoras = Duration.between(horaSaoPaulo, horaParis);
		System.out.println("Diferença de fuso horário: " + diferencaDeHoras.getSeconds() / 60 / 60);


		System.out.println("---------------------------------");
		System.out.println("formatação de datas com a nova API");
		LocalDate hoje = LocalDate.now();
		DateTimeFormatter formatadorBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatadorTraco = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		System.out.println("Data com /: " + hoje.format(formatadorBarra));
		System.out.println("Data com -: " + hoje.format(formatadorTraco));


		System.out.println("---------------------------------");
		System.out.println("métodos interessantes");
		LocalDate data = LocalDate.now();

		System.out.println("Ano bissexto: " + data.isLeapYear());
		System.out.println("Número de dias do mês: " + data.lengthOfMonth());
		System.out.println("Número de dias do ano: " + data.lengthOfYear());
		System.out.println("Menor data: " + LocalDate.MIN);
		System.out.println("Maior data: " + LocalDate.MAX);

	}

}
