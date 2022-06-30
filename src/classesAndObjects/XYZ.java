package classesAndObjects;
import java.util.Scanner;
public class XYZ {
	private int Id;
	private int age;
	private String name;
	Scanner s = new Scanner(System.in);
	public XYZ() {
		System.out.println("Enter Id: ");
		Id = s.nextInt();
		System.out.println("Enter age: ");
//		name = s.nextLine();
		age  = s.nextInt();
//		System.out.println("Hello");
		name = s.next();
		
	}
	void print() {
		System.out.print("Hello You are in XYZ Class");
	}
	public void display() {
		System.out.println(Id + " " + age + " " + name);
	}
}
class YZX extends XYZ{
	void print() {
		System.out.print("Hello You are in YZX Class");
	}
}