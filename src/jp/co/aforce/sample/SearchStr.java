package jp.co.aforce.sample;

public class SearchStr {

	public boolean value(String mom, String jr) {
		boolean contains = false;

		if (mom.indexOf(jr) != -1) {
			contains = true;
		}

		return contains;
	}

}
