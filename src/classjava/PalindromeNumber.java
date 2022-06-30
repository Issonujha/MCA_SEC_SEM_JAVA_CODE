package classjava;

import java.util.Scanner;

public class PalindromeNumber {
	public static boolean pelindromeNumber(int n) {
		int p = n;
		int elem = 0;
		while(p>0) {
			int rem = p%10;
			elem += rem;
			elem*=10;
			p/=10;
		}
		elem/=10;
		if(elem==n) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no to check pelindrome or not ");
		int n = s.nextInt();
		System.out.println(pelindromeNumber(n));
	}

}
