package javapractice;

interface SayHello {
	public void hello();
}

class Greeting {
	static void greet(SayHello s) {
		s.hello();
	}
}

class Person2 implements SayHello {
	public void hello() {
		System.out.println("こんにちは");
	}
}

public class SimpleExample {
	public static void main(String[] args) {
		Person2 p = new Person2();
		Greeting.greet(p);
	}
}
