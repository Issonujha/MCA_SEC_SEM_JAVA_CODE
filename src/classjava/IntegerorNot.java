package classjava;
import java.util.Scanner;
public class IntegerorNot {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the parts : ");
		Boolean b = s.hasNextInt();
		System.out.println(b);
	}
}
