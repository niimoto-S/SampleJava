package jp.co.aforce.practice;

public class PracticeTest2 {

	public static void main(String args[]) {

		//練習問題1
		final double TAX = 0.1;
		System.out.println(TAX);

		//練習問題2
		int x = 480;
		double price = x + ( x * TAX );
		System.out.println(price);

		//練習問題3
		String name = "仁井本 昇馬";
		System.out.println(name);

		//練習問題4
		String head = "この商品の値段は", foot = "円です";
		System.out.println(head + price + foot);

	}

}
