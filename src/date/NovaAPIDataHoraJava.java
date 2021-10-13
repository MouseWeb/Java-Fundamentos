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
		System.out.println("cria��o de datas com a nova classe LocalDate");
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		System.out.println("Dia da semana: " + localDate.getDayOfWeek().name());
		System.out.println("Dia da semana: " + localDate.getDayOfWeek().ordinal());
		System.out.println("Mes: " + localDate.getMonthValue());
		System.out.println("Mes: " + localDate.getMonth().name());
		System.out.println("Ano: " + localDate.getYear());


		System.out.println("---------------------------------");
		System.out.println(" compara��o entre diferentes instantes de tempo");
		Instant iInicial = Instant.now();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Instant iFinal = Instant.now();

		Duration duracao = Duration.between(iInicial, iFinal);
		System.out.println("Dura��o em nanos segundos: " + duracao.toNanos());
		System.out.println("Dura��o em minutos: " + duracao.toMinutes());
		System.out.println("Dura��o em horas: " + duracao.toHours());
		System.out.println("Dura��o em milisegundos: " + duracao.toMillis());
		System.out.println("Dura��o em dias: " + duracao.toDays());


		System.out.println("---------------------------------");
		System.out.println("compara��o de datas (antes, depois, per�odo entre duas datas)");
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
		System.out.println("opera��es em datas como adi��o e subtra��o de dias, meses e anos)");
		LocalDate dataManipulacao = LocalDate.now();
		System.out.println("Mais 5 dias: " + dataManipulacao.plusDays(5));
		System.out.println("Mais 5 semanas: " + dataManipulacao.plusWeeks(5));
		System.out.println("Mais 5 anos: " + dataManipulacao.plusYears(5));
		System.out.println("Mais 2 meses: " + dataManipulacao.plusMonths(2));
		System.out.println("Menos 1 ano: " + dataManipulacao.minusYears(1));
		System.out.println("Menos 1 m�s: " + dataManipulacao.minusMonths(1));
		System.out.println("Menos 3 dia: " + dataManipulacao.minusDays(3));


		System.out.println("---------------------------------");
		System.out.println("classe LocalDate � imut�vel");
		System.out.println("Data Original: " + dataManipulacao);


		System.out.println("---------------------------------");
		System.out.println("compara��o de datas utilizando o fuso hor�rio");
		LocalDateTime hora = LocalDateTime.of(2016, Month.APRIL, 4, 22, 30);

		ZoneId fusoHorarioDeSaoPaulo = ZoneId.of("America/Sao_Paulo");
		ZonedDateTime horaSaoPaulo = ZonedDateTime.of(hora, fusoHorarioDeSaoPaulo);
		System.out.println(horaSaoPaulo);

		ZoneId fusoHorarioDeParis = ZoneId.of("Europe/Paris");
		ZonedDateTime horaParis = ZonedDateTime.of(hora, fusoHorarioDeParis);
		System.out.println(horaParis);

		Duration diferencaDeHoras = Duration.between(horaSaoPaulo, horaParis);
		System.out.println("Diferen�a de fuso hor�rio: " + diferencaDeHoras.getSeconds() / 60 / 60);


		System.out.println("---------------------------------");
		System.out.println("formata��o de datas com a nova API");
		LocalDate hoje = LocalDate.now();
		DateTimeFormatter formatadorBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatadorTraco = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		System.out.println("Data com /: " + hoje.format(formatadorBarra));
		System.out.println("Data com -: " + hoje.format(formatadorTraco));


		System.out.println("---------------------------------");
		System.out.println("m�todos interessantes");
		LocalDate data = LocalDate.now();

		System.out.println("Ano bissexto: " + data.isLeapYear());
		System.out.println("N�mero de dias do m�s: " + data.lengthOfMonth());
		System.out.println("N�mero de dias do ano: " + data.lengthOfYear());
		System.out.println("Menor data: " + LocalDate.MIN);
		System.out.println("Maior data: " + LocalDate.MAX);

	}

}
