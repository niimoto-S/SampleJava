package jp.co.aforce.sample;

import java.util.Calendar;

public class Niimoto18 {

	public static void main(String args[]) {

		Calendar calendar = Calendar.getInstance();
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		String dayOfWeekStr = "";
		switch(dayOfWeek) {
		case 1:
			dayOfWeekStr = "日";
			break;
		case 2:
			dayOfWeekStr = "月";
			break;
		case 3:
			dayOfWeekStr = "火";
			break;
		case 4:
			dayOfWeekStr = "水";
			break;
		case 5:
			dayOfWeekStr = "木";
			break;
		case 6:
			dayOfWeekStr = "金";
			break;
		case 7:
			dayOfWeekStr = "土";
			break;
		}
		System.out.println("今日は" + dayOfWeekStr + "曜日です");
	}

}
