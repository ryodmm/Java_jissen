package javapractice;

class Simple {
	void doSomething() {
		int array[] = new int[3];
		array[10] = 99;
		System.out.println("doSomethingメゾッドを終了します");
	}
}

public class ExceptionExample5 {
	public static void main(String[] args) {
		Simple obj = new Simple();
		try {
			obj.doSomething();
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("例外をキャッチしました");
			e.printStackTrace();
		}
	}
}
