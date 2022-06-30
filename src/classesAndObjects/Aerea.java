package classesAndObjects;

import classesAndObjects.Area;
import classesAndObjects.Circle;
import classesAndObjects.Rectangle;
import classesAndObjects.Traingle;

public class Aerea {

	public static void main(String[] args) {
		Area circle = new Circle(4, 0);
		circle.findArea(4, 0);
		Area rectangle = new Rectangle(4, 5);
		rectangle.findArea(4, 5);
		Area traingle = new Traingle(4, 5);
		traingle.findArea(4, 5);
	}

}
abstract class Area {
	int a;
	int b;
	public Area(int a, int b) {
		this.a = a;
		this.b = b;
	}
	abstract void findArea(int a, int b);
}
class Circle extends Area {
	Circle(int a, int b) {
		super(a, b);
	}
	public void findArea(int a, int b) {
		double area;
		area = 3.14*a*a;
		System.out.println(area);
	}
}
class Rectangle extends Area {
	Rectangle(int a, int b) {
		super(a, b);
	}
	public void findArea(int a, int b) {
		int area;
		area = a*b;
		System.out.println(area);
	}
}
class Traingle extends Area {
	Traingle(int a, int b) {
		super(a, b);
	}
	public void findArea(int a, int b) {
		double area;
		area = 0.5*(a*b);
		System.out.println(area);
	}
}
