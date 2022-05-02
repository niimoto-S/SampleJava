package jp.co.aforce.practice;

import java.util.Random;

public class PracticeTest6 {

	public static void main(String args[]) {

		Random random = new Random();
		int fortune = random.nextInt();
		String result = "";
		switch(fortune) {
		case 1:
			result = "吉です";
			break;
		case 2:
			result = "中吉です";
			break;
		case 3:
			result = "大吉です";
			break;
		default:
			result = "凶です";
			break;
		}

		System.out.println(result);
		int total = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 7 == 0) {
				total = total + i;
			}
		}
		System.out.println("7の倍数の総合計は" + total);

		for(int a = 1; a <= 9; a++){
            for(int b = 1; b <= 9; b++){
                int c = a*b;
                String d = Integer.toString(c);
                if(d.length() == 1){
                    d = d + " ";
                }
                System.out.print(d + " ");
            }
            System.out.println();
		}
	}
}
