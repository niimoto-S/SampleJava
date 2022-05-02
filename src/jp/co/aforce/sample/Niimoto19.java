package jp.co.aforce.sample;

public class Niimoto19 {

	public static void main(String args[]) {

		int i = 1;
		while (i <= 30) {

			if (i % 3 == 0) {
				System.out.println(i);
			}
			i++;
		}
		i = 1;
		do {
			if(i % 2 == 0) {
				System.out.println(i);
			}
			++i;
		} while (i < 10);
	}
}
