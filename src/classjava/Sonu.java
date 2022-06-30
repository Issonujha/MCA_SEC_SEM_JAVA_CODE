package classjava;
import java.util.Scanner;
public abstract class Sonu {
	public abstract void Area_Sonu();
	public static void main(String []args) {
		Scanner s = new Scanner(System.in);
		System.out.println("To compute the area of any Shape: ");
		System.out.println("For Rectangle choose 1: ");
		System.out.println("For Circle choose 2: ");
		System.out.println("For traingle choose 3: ");
		System.out.println("For Exit choose 4: ");
		System.out.println("Enter the choices: ");
		int choice = s.nextInt();
		while(choice>0) {
			switch(choice) {
				case 1: System.out.println("You selected Rectangle");
						Rectangle_sk rect = new Rectangle_sk();
						rect.Area_Sonu();
						break;
				case 2: System.out.println("You selected Circle");
						Circle_sk circ = new Circle_sk();
						circ.Area_Sonu();
						break;
				case 3: System.out.println("You selected Rectangle");
						Traingle_sk train = new Traingle_sk();
						train.Area_Sonu();
						break;
				case 4: System.out.println("Thank you for Getting Area");
						System.exit(0);
				default: System.out.println("Wrong Choice: Please select other");
						 break;
			}
			System.out.println("To compute the area of any Shape: ");
			System.out.println("For Rectangle choose 1: ");
			System.out.println("For Circle choose 2: ");
			System.out.println("For traingle choose 3: ");
			System.out.println("For Exit choose 4: ");
			System.out.println("Enter the choices: ");
			choice = s.nextInt();
		}
	}
}
class Rectangle_sk extends Sonu {
	Scanner s = new Scanner(System.in);
	public void Area_Sonu() {
		System.out.println("Enter the Length");
		int a = s.nextInt();
		System.out.println("Enter the Breath");
		int b = s.nextInt();
		System.out.println("Area of Rectangle is" + a*b);
	}
}
class Circle_sk extends Sonu {
	Scanner s = new Scanner(System.in);
	public void Area_Sonu() {
		System.out.println("Enter the Radius");
		int r = s.nextInt();
		System.out.println("Area of Circle is" + 3.14*r*r);
	}
}
class Traingle_sk extends Sonu {
	Scanner s = new Scanner(System.in);
	public void Area_Sonu() {
		System.out.println("Enter the Base");
		int b = s.nextInt();
		System.out.println("Enter the Height");
		int h = s.nextInt();
		System.out.println("Area of Traingle is" + 0.5*b*h);
	}
}