package javapractice;

public class InnerClassExample2 {
	public static void main(String[] args) {
		class Person2 implements SayHello {
			public void hello() {
				System.out.println("こんにちは");
			}
		}
		Person2 p = new Person2();
		Greeting.greet(p);
	}

}
