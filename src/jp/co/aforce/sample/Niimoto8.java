package jp.co.aforce.sample;

public class Niimoto8 extends Niimoto7 {

	@Override
	public int sample(int value) {
		System.out.println("niimoto" + value);
		int a = super.index;
		System.out.println(a);
		return value;
	}

}
