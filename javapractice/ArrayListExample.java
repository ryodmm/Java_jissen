package javapractice;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> month = new ArrayList<String>(); //文字列を格納するためのArrayListオブジェクトを作成

		month.add("January"); //
		month.add("Februaly"); //　要素を作成
		month.add("March"); //

		System.out.println("要素数" + month.size()); // 要素数を確認
		for (int i = 0; i < month.size(); i++) {
			System.out.println(month.get(i)); // i番目の要素を出力
		}

		month.remove(1); // １番目の要素を取り除く
		System.out.println("要素数" + month.size());
		for (int i = 0; i < month.size(); i++) {
			System.out.println(month.get(i));
		}
	}

}
