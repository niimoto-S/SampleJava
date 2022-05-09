package thread;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		MyThread t1 = new MyThread("name1");
		MyThread t2 = new MyThread("name2");

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		System.out.println("処理の終了");
		System.out.println("--------------------------+");
		t1.printList();
		System.out.println("--------------------------+");
		t2.printList();
		System.out.println("--------------------------+");

	}
}
