package jp.co.aforce.sample;

import java.util.HashSet;

//HashMapの使い方を書いている
public class Niimoto12 {

	public static void main(String args[]) {

		HashSet<String> peachBoys = new HashSet<>();
		peachBoys.add("桃太郎");
		peachBoys.add("サル");
		peachBoys.add("犬");
		peachBoys.add("キジ");
		peachBoys.add("きびだんご");
		peachBoys.add("きびだんご");

		System.out.println(peachBoys);

		peachBoys.clear();
	}
}
