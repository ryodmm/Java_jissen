package javapractice;

import java.io.Serializable;

class Point3 implements Serializable {
	int x;
	int y;

	Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Triangle implements Serializable {
	Point3 p0;
	Point3 p1;
	Point3 p2;
}
