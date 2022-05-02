package jp.co.aforce.sample;

public class Niimoto5 extends Niimoto4{

	@Override
	void speedDown(int value) {
		value *= 1.1;
		super.speedDown(value);
	}

}
