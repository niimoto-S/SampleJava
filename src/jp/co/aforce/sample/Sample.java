package jp.co.aforce.sample;

public class Sample {

	public static void main(String args[]) {
		System.out.println("Hello world");

		int sample = Niimoto.sample(100);
		System.out.println(sample);
		System.out.println("私の名前は" + Niimoto.name());

		Niimoto2 sampleStr = new Niimoto2();
		System.out.println(sampleStr.sample());

	}

}
