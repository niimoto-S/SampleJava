package jp.co.aforce.sample;

import java.util.Arrays;
import java.util.HashMap;

public class Niimoto22 {

	public static void main(String args[]) {

		HashMap<String, String> members = new HashMap<String, String>();

		members.put("naka@s.jp", "中垣健志");
		members.put("haya@s.jp", "林満也");

		System.out.println(members);

		members.remove("haya@s.jp");
		System.out.println(members);

		members.put("haya@s.jp", "林満也");

		String member = members.get("haya@s.jp");
		System.out.println(member);

		String[] fruits = new String[100];
		float[] lapTimes = new float[100];
		String[] singo = {"赤","青","黒"};
		System.out.println(singo[0]);
		System.out.println(Arrays.toString(singo));

		String[] fruits2 = new String[5];
		fruits2[0] = "りんご";
		String fruitName = fruits2[0];

		System.out.println(fruitName);
		System.out.println(fruits2[1]);

	}

}
