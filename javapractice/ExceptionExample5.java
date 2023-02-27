package javapractice;

class Simple {
	void doSomething() {
		int array[] = new int[3];
		array[10] = 99; //配列のインデックスの指定が範囲（０〜２）を超えている
		System.out.println("doSomethingメゾッドを終了します");
	}
}

public class ExceptionExample5 {
	public static void main(String[] args) {
		Simple obj = new Simple();
		try {
			obj.doSomething(); //Simple肩のオブジェクトのdoSomethingメゾッドを呼び出し
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("例外をキャッチしました");
			e.printStackTrace(); //メゾッドの呼び出し履歴を出力
		}
	}
}
