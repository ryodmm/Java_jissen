package javapractice;

class MyThread extends Thread { //Threadクラスを継承
	public void run() { // runメゾッドをオーバーライド
		for (int i = 0; i < 100; i++) { //	
			System.out.println("MyTreadのrunメゾッド(" + i + ")"); // runメゾッドの中で出力を100回繰り返す
		} //
	}
}

public class SimpleThreadTest {
	public static void main(String[] args) {
		MyThread t = new MyThread(); //MyThreadオブジェクトを生成
		t.start(); // startメゾッドを呼び出し
					// これによりスレッドを開始する

		for (int i = 0; i < 100; i++) { //
			System.out.println("impleThreadTestのmainメゾッド(" + i + ")"); //mainメゾッドの中で出力を100回繰り返す
		} //
	}

}
