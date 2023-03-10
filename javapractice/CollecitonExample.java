package javapractice;

import java.util.ArrayList;

class Point2 {
	int x;
	int y;

	Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void printInfo() {
		System.out.println("(" + this.x + ", " + this.y + ")");
	}
}

public class CollecitonExample {
	public static void main(String[] args) {
		ArrayList<Point2> pointList = new ArrayList<>();
		pointList.add(new Point2(0, 8));
		pointList.add(new Point2(1, 6));
		pointList.add(new Point2(2, 9));
		pointList.add(new Point2(3, 3));

		pointList.forEach(p -> {
			p.x *= 2;
			p.y *= 2;
		});
		pointList.forEach(p -> p.printInfo());
	}

}
