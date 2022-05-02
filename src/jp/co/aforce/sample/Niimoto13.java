package jp.co.aforce.sample;

import java.util.HashMap;

public class Niimoto13 {

	public static void main(String args[]) {

		HashMap<String, String> employee = new HashMap<>();
		employee.put("A001", "田中太郎");
		employee.put("A002", "佐藤次郎");
		employee.put("A003", "山田花子");
		employee.put("A004", "佐藤次郎");

		System.out.println(employee);
		employee.remove("A003"); //花子さんの要素を削除
		System.out.println(employee);
		employee.put("A004", "高橋三郎"); //既存キーを上書き ※非推奨
		System.out.println(employee);
		employee.replace("A005", ""); //既存キーを上書き ※推奨
		System.out.println(employee);
		employee.clear();
	}
}
