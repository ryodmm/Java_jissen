package javapractice;

class SimpleClass {
	String str;

	public SimpleClass(String str) {
		this.str = str;

	}
}

public class MultiClassExample2 {
	public static void main(String[] args) {
		SimpleClass sc = new SimpleClass("Hello.");
		System.out.println(sc.str);
	}
}
