package jp.co.aforce.sample;

public class Niimoto23 {

	public static void main(String args[]) {

		int x = 100;
		if(x < 100) {
			System.out.println("条件に一致したので");
			System.out.println("処理を実行します");
		}

		if(x < 100) {
			System.out.println("xは100より小さい");
		} else {
			System.out.println("xは100以上");
		}

		if(x < 100) {
			System.out.println("xは100より小さい");
		} else if(x < 200) {
			System.out.println("xは200より小さい");
		} else {
			System.out.println("xは200以上");
		}

	}

}
