package jp.co.aforce.sample;

public class Niimoto16 {

	private final int coin1 = 1;
	private final int coin5 = 5;
	private final int coin10 = 10;
	private final int coin50 = 50;
	private final int coin100 = 100;
	private final int coin500 = 500;
	private final int bill1000 = 1000;

	private final int tea = 120;
	private final int coffee = 80;

	//コインまたは紙幣が投入されたときに正常な金額を返すよ。
	//不正な金額は0を返すよ
	public int money(int value) {

		int index = 0;

		switch(value) {
		case coin1:
			index = coin1;
			break;
		case coin5:
			index = coin5;
			break;
		case coin10:
			index = coin10;
			break;
		case coin50:
			index = coin50;
			break;
		case coin100:
			index = coin100;
			break;
		case coin500:
			index = coin500;
			break;
		case bill1000:
			index = bill1000;
			break;
		default:
			index = 0;
			break;
		}
		return index;
	}

	//登録されている商品名が渡されたら設定された要求金額を返すよ
	public int item(String name) {

		int claim;

		switch(name) {
		case "tea":
			claim = tea;
			break;
		case "coffee":
			claim = coffee;
			break;
		default:
			claim = 0;
		}
		return claim;
	}

}
