package jp.co.aforce.sample;

public class Niimoto3 {

	public static void main(String args[]) {
		Sample sam = new Sample2();
		sam.say();
	}

	static class Sample {
		void say() {
			System.out.println("hello");
		}
	}

	static class Sample2 extends Sample {
		@Override
		void say() {
			System.out.println("こんちは");
		}
	}
}