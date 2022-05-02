package jp.co.aforce.sample;

public class Niimoto7 {

	protected int index;

	public int sample(int value) {
		this.index = value * 2;
		System.out.println("niimotoは" + this.index);
		return this.index;
	}

}
