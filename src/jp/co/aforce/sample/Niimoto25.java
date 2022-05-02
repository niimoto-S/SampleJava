package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class Niimoto25 {

	public static void main(String args[]) {

		List<String> list = new ArrayList<String>();

		list.add("apple");
		list.add("banana");
		list.add("cherry");

		list.forEach(s -> System.out.println(s));

		for(String s :list) {
			System.out.println(s);
		}

		System.out.println("-------------------");

		int sum = 0;

		List<String> list2 = new ArrayList<String>();

		list2.add("1");
		list2.add("2");
		list2.add("3");

		//拡張forで書いた場合
		for (String s :list2) {
			sum += Integer.parseInt(s);
		}
		System.out.println(sum);

		sum = 0;

		//ラムダ式で書いた場合
		sum = list2.stream()
				.mapToInt(s -> Integer.parseInt(s))
				.sum();
		System.out.println(sum);
	}

}
