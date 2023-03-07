package jissen_practice;

import java.util.ArrayList;
import java.util.Collections;

class Price implements Comparable<Price> {

	int p;

	Price(int p) {
		this.p = p;
	}

	public int compareTo(Price prc) {
		return (this.p) - (prc.p);
	}
}

public class P121_Book {
	public static void main(String[] args) {
		ArrayList<Price> priceList = new ArrayList<Price>();
		priceList.add(new Price(500));
		priceList.add(new Price(200));
		priceList.add(new Price(900));
		priceList.add(new Price(400));

		Collections.sort(priceList);

		for (Price prc : priceList) {
			System.out.println(prc.p);
		}
	}
}
