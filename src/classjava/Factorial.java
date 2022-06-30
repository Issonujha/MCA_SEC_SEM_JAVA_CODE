package classjava;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no to get factorial ");
		int n = s.nextInt();
		System.out.println("Factorial of "+ n + " is " +factorial(n));
	}

	private static int factorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		
		return n * factorial(n-1);
	}

}
