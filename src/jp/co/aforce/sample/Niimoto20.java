package jp.co.aforce.sample;

public class Niimoto20 {

	public static void main(String args[]) {

		final int fore = 4;
		final String[] dayOfWeekJp = {"日","月","火","水","木","金","土"};
		final String[] dayOfWeekEn = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};

		for(int i = 1; i <= 9; i++) {
			System.out.println(fore + " × " + i + " = " + (fore * i));
		}

		for(int i = 0; i < dayOfWeekJp.length; i++) {
			System.out.println(dayOfWeekJp[i] + "曜日は英語では" + dayOfWeekEn[i] + "です");
		}

	}

}
