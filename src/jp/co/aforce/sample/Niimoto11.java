package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.HashMap;

//コレクションを学習した内容を書いていく
//ここではArrayListの学習内容を書いている
public class Niimoto11 {

	public static void main(String args[]) {
		//基本的な例
		ArrayList<Integer> numbers = new ArrayList<>();

		//マップの例
		HashMap<Integer, String> employees = new HashMap<>();

		ArrayList<String> collars = new ArrayList<>();
		collars.add("赤");
		collars.add("青");
		collars.add("黄色");
		collars.add("オレンジ");
		collars.add("緑");
		collars.add("ピンク");
		collars.add("紫");
		System.out.println(collars.get(5));

		collars.remove(1);
		collars.add(2, "水色");

		System.out.println(collars.get(1));

		collars.set(6, "白");
		collars.add(0, "黒");

		System.out.println(collars.get(6));

		System.out.println("ここから");
		for(int i = 0;i < collars.size(); i++) {
			System.out.println(collars.get(i));
		}
		collars.clear();

		ArrayList<String> fruit = new ArrayList<>();
		fruit.add("りんご");
		fruit.add("みかん");
		fruit.add(1, "ぶどう");
		fruit.remove(0);
		fruit.remove("ぶどう");
		fruit.add(0, "りんご");
		fruit.add(1, "ぶどう");
		System.out.println(fruit);
		fruit.set(1, "メロン");
		System.out.println(fruit);
		fruit.clear();
	}

}
