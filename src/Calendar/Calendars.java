package Calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Calendars {
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
//		cal.add(Calendar.HOUR_OF_DAY, 4);
//		d = cal.getTime();
		
		//pegando valor 
		
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);
		
		System.out.println("Minuyte: " + minutes);
		System.out.println("MONTH: " + month );
		
		System.out.println(sdf.format(d));

		System.out.println("Bom dia");
		
		
	}

}
