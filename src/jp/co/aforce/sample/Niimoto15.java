package jp.co.aforce.sample;

import java.util.Scanner;

public class Niimoto15 {

	public static void main(String args[]) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Niimoto16 niimoto16 = new Niimoto16();
		int lineInt;
		String selectItem;
		int claim = 0;
		int totalMoney = 0;
		boolean buy = true;
		System.out.println("お金の投入をやめる際は数値以外を入力してください");
		while(buy) {
			String line = sc.nextLine();
			try {
				lineInt = niimoto16.money(Integer.parseInt(line));
				totalMoney = totalMoney + lineInt;
				System.out.println(lineInt + "円を入れた:現在" + totalMoney + "円");

			} catch (Exception e) {
				buy = false;
			}
		}
		System.out.println("tea or coffee?");
		selectItem = sc.nextLine();
		claim = niimoto16.item(selectItem);

		if(claim != 0) {
			if(totalMoney == claim) {
				System.out.println("お買い上げありがとうございました！こちら商品の" + selectItem + "です!");
			} else if(totalMoney > claim) {
				System.out.println("お買い上げありがとうございました！こちら商品の" + selectItem + "と、おつりが" + (totalMoney - claim) + "円になります！");
			} else if(totalMoney < claim) {
				System.out.println("金が足りねえならお客さんじゃないやい！一昨日きやがれ！");
			} else {
				System.out.println("ここの条件分岐には到達しないはずだよ？");
			}
		} else {
			System.out.println("ちゃんと商品選んでね");
		}
	}
}
