package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class CalendarExemplo {

	public static void main(String[] args) throws ParseException {

		// Somando uma unidade de tempo
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

		System.out.println(sdf.format(d));

		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();

		System.out.println(sdf.format(d));

		System.out.println("-------------");

		// Obtendo uma unidade de tempo
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d1 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf1.format(d1));
		
		Calendar cal1 = Calendar.getInstance();
		cal.setTime(d1);
		int minutes = cal1.get(Calendar.MINUTE);
		int month = 1 + cal1.get(Calendar.MONTH);
		int year = cal1.get(Calendar.YEAR);
		int millisecond = cal1.get(Calendar.MILLISECOND);
		
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
		System.out.println("Year: " + year);
		System.out.println("Millesecond: " + millisecond);

	}

}