package classjava;
import java.util.Scanner;
public class GetAndPrintNumber {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter the Integer");
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		
		System.out.println("Your Lucky Number is "+ num);

	}

}
