package jp.co.aforce.sample;

public class Example02 {
	public static void main(String args[]) {
		MyThread t1 = new MyThread("thread01");
		MyThread t2 = new MyThread("thread02");

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("メインスレッドを終了します。");
	}
}
