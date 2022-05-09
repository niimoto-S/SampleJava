package thread;

public class MyThread extends Thread {
	private String name;
	private String[][] list = new String[10][10];

	void printList() {
		for(int i = 1; i < list.length; i++) {
			for(int j = 1; j < list[i].length; j++) {
				System.out.print(list[i][j]);
			}
			System.out.println();
		}
	}

	public MyThread(String name) {
		this.name = name;
	}

	public void run() {

		for (int a = 1; a <= 9; a++) {

			for (int b = 1; b <= 9; b++) {
				int c = a * b;
				String d = Integer.toString(c);
				if (d.length() == 1) {
					d = d + " ";
				}
				this.list[a][b] = d + " ";
				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
				System.out.println(name + "の処理を実行しました[" + a + "][" + b + "]");
				System.out.println("代入した数値は、" + this.list[a][b] + "です");
			}
		}
	}
}
