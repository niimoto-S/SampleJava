package jp.co.aforce.sample;

public class Niimoto6 {

	public static void main(String args[]) {
		Niimoto7 niimoto = new Niimoto8();
		int aaa = niimoto.sample(100);
		System.out.println(aaa);

		int value = 100;
		value += 10;
		--value;
		System.out.println(value);

		String lastName = "仁井本", firstName = "昇馬";
		String myName = lastName + firstName;
		System.out.println(myName);

		String saying = "「明日は明日の風が吹く」";
		String search = "風が吹く";
		SearchStr searchStr = new SearchStr();
		boolean result = searchStr.value(saying, search);
		System.out.println(result);

		boolean result2 = saying.contains(search);
		System.out.println(result2);

		String a = null;
		System.out.println(a);

		String bad = "振る池や 蛙飛び込む 水の音";
		String good = bad.replace("振る", "古");
		System.out.println(bad);
		System.out.println(good);

		bad.length();

		String haiku = "ふるいけやかわずとびこむみずのおと";
		String middle = haiku.substring(5, 12);
		System.out.println(middle);

		System.out.println("かえる\nぴょこぴょこ\nみぴょこぴょこ");

	}
}