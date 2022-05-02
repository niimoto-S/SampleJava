package jp.co.aforce.sample;

import java.util.Scanner;

//条件分岐if
public class Niimoto17 {

	public static void main(String args[]) {

		@SuppressWarnings("unused")
		Scanner sc = new Scanner(System.in);
		int value;
		System.out.println("数値を入力してください。");
		try {
			value = Integer.parseInt(sc.nextLine());

			if(value == 0) {
				System.out.println("値は" + value + "です");
			} else if(value >= 1 && value <= 5) {
				System.out.println("値は1以上5以下です");
			} else {
				System.out.println("値は" + value + "です");
			}

		} catch (NumberFormatException e) {
			System.out.println("数値を入力してくださいね");
		}

	}

}
