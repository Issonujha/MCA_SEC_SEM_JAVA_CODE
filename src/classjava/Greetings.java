package classjava;
import java.util.Scanner;
public class Greetings {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Name: ");
		String name = s.nextLine();
		System.out.print("Hello "+ name);
		System.out.println(" have a good day");
	}

}
