package jp.co.aforce.sample;

//ジェネリクス実装
public class Warehouse<T> {
	private T item;

	//オブジェクトを預かる
	public void stock(T item) {
		this.item = item;
	}

	//オブジェクトを取り出す
	public T leave() {
		T item = this.item;
		this.item = null;
		return item;
	}
}
