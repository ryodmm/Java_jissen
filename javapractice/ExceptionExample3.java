package javapractice;

public class ExceptionExample3 {
	public static void main(String[] args) {
		int a = 4;
		int b = 0;
		try {
			int c = a / b;
			System.out.println("cの値は" + c);
		} catch (ArithmeticException e) {
			System.out.println("例外をキャッチしました");
			System.out.println(e); //例外の内容をコンソールで表示
		}
		System.out.println("処理を正常に終了します。");
	}
}
