package javapractice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputExample {
	public static void main(String[] args) {
		Triangle tri = new Triangle();
		tri.p0 = new Point3(0, 0);
		tri.p1 = new Point3(0, 10);
		tri.p2 = new Point3(5, 10);

		try {
			FileOutputStream fs = new FileOutputStream("/Users/onoderaryo/Desktop/Java/triangle.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(tri);
			os.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
