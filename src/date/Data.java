package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Data {

	// Date:
	// Representa um INSTANTE
	// Pacote java.util

	// Um objeto Date internamente armazena:
	// � O n�mero de milissegundos desde a meia noite do dia 1 de janeiro de 1970
	// GMT (UTC)
	// � GMT: Greenwich MeanTime (time zone)
	// � UTC: CoordinatedUniversal Time (time standard)

	// SimpleDateFormat -> � uma classe:
	// � Define formatos para convers�o entre Date e String
	// � dd/MM/yyyy -> 23/07/2018
	// � dd/MM/yyyy HH:mm:ss -> 23/07/2018 15:42:07

	// Padr�o ISO 8601 e classe Instant:
	// � Formato: yyyy-MM-ddTHH:mm:ssZ -> UTC = Boas pr�ticas sempre quarda no
	// bancom com formato UTC.
	// � Exemplo: "2018-06-25T15:42:07Z"
	// � Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z")); -> Classe
	// Instant tem uma fun��o Parse aparti da vers�o vers�o 8 do java.
	// -> Date.from = Automaticamente � convertido para o tipo Date do java.

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		System.out.println("x3: " + x3);
		System.out.println("x4: " + x4);
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
		System.out.println("y3: " + y3);
		
		System.out.println("-------------");
		
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y3: " + sdf2.format(y3));
		
		System.out.println("-------------");
		
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("y3: " + sdf3.format(y3));

	}

}
