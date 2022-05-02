package jp.co.aforce.sample;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;



public class Niimoto9 {

	public static void main(String args[]) {
		Calendar cal = Calendar.getInstance();
		Date today = cal.getTime();
		System.out.println(today);

		//(生まれた年、生まれた月 -1、生まれた日)
		cal.set(1999, 4, 6);
		Date birthday = cal.getTime();
		System.out.println(birthday);

		cal.clear();
		cal.set(2020, 0, 2, 10, 20, 30);
		Date date = cal.getTime();
		System.out.println(date);
		System.out.println(cal.getWeekYear());
		System.out.println(cal.get(Calendar.YEAR)); //年を取得
		cal.add(Calendar.HOUR, -5); //5時間前をセットする
		System.out.println(cal.getTime());

		cal.clear();
		cal.set(0, 0, 1, 0, 0, 0);
		SimpleDateFormat dateFormat = new SimpleDateFormat("y年 M月 d日 E曜日 H時: m分: s秒");
		System.out.println(dateFormat.format(cal.getTime()));

		System.out.println("数値を入力してください");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int lineInt;
		try {
			lineInt = Integer.parseInt(line);

			switch(lineInt) {
			case 1:
				System.out.println("１です");
				break;
			case 2:
				System.out.println("２です");
				break;
			default:
				System.out.println("１か２のどちらかを入力して下さい 入力した値：" + line);
			}
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("数値を入力してください 入力した値：" + line);
		}


	}
}
