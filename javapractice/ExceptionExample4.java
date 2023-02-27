package javapractice;

public class ExceptionExample4 {
	public static void main(String[] args) {
		int a = 4;
		int b = 0;
		try {
			int c = a / b;
			System.out.println("cの値は" + c);
		} catch (ArithmeticException e) {
			System.out.println("例外をキャッチしました");
			System.out.println(e); //例外の内容をコンソールで表示
			return; //メゾッドが終了する（mainメゾッドの場合はプログラムが終了する）
		} finally {
			System.out.println("finallyブロックの処理です");
		}
		System.out.println("プロフラムを終了します。");
	}
}
