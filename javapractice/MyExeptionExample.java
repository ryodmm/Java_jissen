package javapractice;

class InvalidAgeException extends Exception {
	InvalidAgeException(String message) {
		super(message); //superクラスであるExceptionクラスのコンストラクタを呼び出す
	}
}

public class MyExeptionExample {
	public static void main(String[] args) {
		int age = -10;
		try {
			if (age < 0) {
				throw new InvalidAgeException("年齢にマイナスの値が指定されました");
			}
			System.out.println("年齢は" + age + "です");
		} catch (InvalidAgeException e) {
			System.out.println("例外をキャッチしました");
			System.out.println(e);
		}
	}
}
