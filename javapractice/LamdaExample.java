package javapractice;

interface SimpleInterface {
	public int doSomething(int n);
}

public class LamdaExample {
	static void printout(SimpleInterface i) {
		System.out.println(i.doSomething(2));
	}

	public static void main(String[] args) {
		printout(n -> n + 1);
	}

}
