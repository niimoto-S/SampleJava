package jp.co.aforce.sample;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Niimoto10 {

	public static void main(String args[]) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());

		calendar.set(1234, 4, 6);
		System.out.println(calendar.getTime());

		calendar.clear();
		calendar.set(1234, 4, 6);
		System.out.println(calendar.getTime());

		calendar.clear();
		calendar.set(1984, 11, 26, 11, 33 ,50);
		int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);
		System.out.println(hourOfDay);

		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(dayOfWeek);

		calendar.clear();
		calendar.set(1984, 11, 26, 11, 33, 50);
		System.out.println(calendar.getTime());

		calendar.set(Calendar.YEAR, 2018);
		System.out.println(calendar.getTime());

		calendar.set(Calendar.SECOND, 00);
		System.out.println(calendar.getTime());

		calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		calendar.add(Calendar.DAY_OF_MONTH, 3);
		System.out.println(calendar.getTime());

		calendar.add(Calendar.MONTH, -6);
		System.out.println(calendar.getTime());

		calendar = Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String format = dateFormat.format(calendar.getTime());
		System.out.println(format);

	}
}
