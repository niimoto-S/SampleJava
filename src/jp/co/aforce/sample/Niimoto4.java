package jp.co.aforce.sample;

public class Niimoto4 {
	protected int speed;

	void speedUp(int value) {
		this.speed += value;
		if(this.speed >= 180) {
			//speedは180が限界値だよ
			this.speed = 180;
		}
	}

	void speedDown(int value) {
		this.speed -= value;
		if(this.speed <= -15) {
			this.speed = -15;
		}
	}
}
