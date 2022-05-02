package jp.co.aforce.sample;

public class Niimoto26 {
	public static void main(String args[]) {

		//こんな感じでインスタンスにオブジェクトを預ける
		Warehouse<Niimoto> warehouse = new Warehouse<>();
		Niimoto niimoto = new Niimoto();
		warehouse.stock(niimoto);
		//預けたものを引き出す
		Niimoto niimoto2 = (Niimoto) warehouse.leave();
	}
}