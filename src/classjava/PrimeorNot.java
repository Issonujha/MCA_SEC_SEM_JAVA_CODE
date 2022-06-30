package classjava;

import java.util.Scanner;

public class PrimeorNot {
	public static boolean primeOrNot(int n) {
		for(int i = 2; i<=n/2; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number to check prime or Not ");
		int n = s.nextInt();
		System.out.println(primeOrNot(n));
	}

}
