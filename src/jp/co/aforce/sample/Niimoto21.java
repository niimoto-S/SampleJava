package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.HashSet;

public class Niimoto21 {

	public static void main(String args[]) {
		ArrayList<String> employees = new ArrayList<>();
		employees.add("田中太郎");
		employees.add("山田花子");
		employees.add("佐藤次郎");

		for (String employee : employees) {
			System.out.println(employee);
		}
		employees.clear();

		int count = 0;
		while (true) {
			if (count == 5) {
				break;
			}
			count++;
		}
		System.out.println(count);

		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				continue; //以下for文内の命令を無視する
			}
			System.out.println(i);
		}

		HashSet<String> books = new HashSet<String>();
		books.add("不思議の国のアリス");
		books.add("ヘンゼルとグレーテル");
		books.add("銀河鉄道の夜");

		for(String book : books) {
			System.out.println(book);
		}
		books.forEach(book -> System.out.println(book));
	}
}
