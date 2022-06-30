package classjava;
import java.util.Scanner;
public class SumOfThreeNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the first Number: ");
		int first = s.nextInt();
		System.out.print("Enter the second Number: ");
		int second = s.nextInt();
		System.out.print("Enter the third Number: ");
		int third = s.nextInt();
		int sum = first +second+third;
		System.out.println("Sum is "+first+"+"+second+"+"+third+"="+sum);
	}

}
