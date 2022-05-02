package jp.co.aforce.practice;

import java.util.Calendar;

public class PracticeTest5 {

	public static void main(String args[]) {

		//練習問題2
		String[] animal = {"犬", "猫", "うさぎ", "へび"};

		//練習問題3
		String likeName = "うさぎ";
		String announce = "はリストに含まれていません";
		for(int i = 0; i < animal.length; i++) {
			if(animal[i].equals(likeName)) {
				announce = "はリストに含まれています";
			}
		}

		System.out.println(likeName + announce);


		//練習問題4
		Calendar calendar = Calendar.getInstance();
		calendar.set(1999, 5, 6);
		int mon = calendar.get(Calendar.MONTH);
		String s = "なし";
		switch(mon) {
		case 1:
			s = "元日,成人の日";
			break;
		case 2:
			s = "建国記念の日,天皇誕生日";
		case 3:
			s = "春分の日";
			break;
		case 4:
			s = "昭和の日";
			break;
		case 5:
			s = "憲法記念日,みどりの日,子供の日";
			break;
		case 6:
			break;
		case 7:
			s = "海の日,スポーツの日";
			break;
		case 8:
			s = "山の日";
			break;
		case 9:
			s = "敬老の日,秋分の日";
			break;
		case 10:
			break;
		case 11:
			s = "文化の日,勤労感謝の日";
			break;
		case 12:
			break;
		}

		System.out.println(s);

	}

}
