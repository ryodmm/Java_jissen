package jissen_practice;

import java.util.Iterator;
import java.util.LinkedList;

public class practiceP121 {
	public static void main(String[] args) {

		String[] list = { "a", "b", "c" };
		for (String str : list) {
			System.out.println(str);
		}

		LinkedList<String> list2 = new LinkedList<>();
		Iterator<String> it = list2.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		/*　Iteretor答え↓
		Iterator<String> it;
		while (it.hasNext()) {
			System.out.println(it.hasNext());
		*/
	}

}
