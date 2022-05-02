package jp.co.aforce.sample;

public class Example03 {
	public static void main(String args[]) {

		//スレッド処理が書けない場合にのみRunnableクラスを定義する
		//継承の制約がない場合はThread
		//ある場合はRunnable
		Thread t1 = new Thread(new MyRunnable());

		t1.start();

		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("メインスレッドを終了します。");
	}
}
