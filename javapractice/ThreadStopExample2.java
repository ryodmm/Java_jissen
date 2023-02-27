package javapractice;

class MyThread4 extends Thread {
	public boolean running = true;

	public void run() {
		while (running) {
			System.out.println("*");
		}
		System.out.println("runメゾッドを終了します");
	}
}

public class ThreadStopExample2 {
	public static void main(String[] args) {
		MyThread4 t = new MyThread4();
		t.start();

		try {
			Thread.sleep(5);
		} catch (Exception e) {
			System.out.println(e);// TODO: handle exception
		}

		t.running = false;
	}
}
