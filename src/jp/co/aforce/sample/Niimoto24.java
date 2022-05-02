package jp.co.aforce.sample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Niimoto24 {

	public static void main(String args[]) {

		Map<String, String> exMap = new HashMap<String, String>();

		exMap.put("name1", "佐藤");
		exMap.put("name2", "佐々木");
		exMap.put("name3", "吉田");

		//Iteratorを使ったfor文
		for (Iterator<String> iterator = exMap.keySet().iterator(); iterator.hasNext();) {
			String key = iterator.next();
			String value = exMap.get(key);
			System.out.println(key + " : " + value);
		}
		//valueのみを取り出したいとき
		for (Iterator<String> iterator = exMap.values().iterator(); iterator.hasNext();) {
			String value = iterator.next();
			System.out.println(value);
		}
		//entrySetメソッドを使った例
		for (Iterator<Map.Entry<String, String>> iterator = exMap.entrySet().iterator(); iterator.hasNext();) {
			Map.Entry<String, String> entry = iterator.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		//forEachメソッドとラムダ式
		exMap.forEach((key, val) -> System.out.println(key + " : " + val));
		//keyのみやvalueのみの出力も可能
		exMap.forEach((key, val) -> System.out.println(key));
		exMap.forEach((key, val) -> System.out.println(val));

		int x = 1;
		int amount = 0;

		while (amount < 10) {
			System.out.println(x + "を足します");
			amount = amount + x;
			x++;
		}
		System.out.println(amount);

		amount = 0;
		do {
			System.out.println(x + "を足します");
			amount = amount + x;
			x++;
		} while (amount < 10);
		System.out.println(amount);

	}
}
