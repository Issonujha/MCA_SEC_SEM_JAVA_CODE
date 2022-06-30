package classesAndObjects;

public class Overridding {

	public static void main(String[] args) {
		XYZ1 ref;
		ref = new PQR();
		ref.display();
		ref = new XYZ1();
		ref.display();
	}

}
class XYZ1 {
	public void display() {
		System.out.println("In the Parent class");
	}
}
class PQR extends XYZ1{
	public void display() {
		System.out.println("I am in derived Class");
	}
}