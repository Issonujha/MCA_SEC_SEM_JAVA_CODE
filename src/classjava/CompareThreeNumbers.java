package classjava;

import java.util.Scanner;

public class CompareThreeNumbers {
	public static int withoutTernaryOperator(int a, int b, int c) {
		if(a>b) {
			if(a>c) {
				return a;
			}
			else {
				return c;
			}
		}
		else {
			if(b>c) {
				return b;
			}
			else {
				return c;
			}
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first Number ");
		int a = s.nextInt();
		System.out.println("Enter Second Number ");
		int b = s.nextInt();
		System.out.println("Enter Third Number ");
		int c = s.nextInt();
		int d = 0;
		System.out.println((a>b) ? ((a>c)?a + " is Greatest" : c +" is Greatest") : ((b>c) ? b + " is Greatest" : c + " is Greatest"));
		System.out.println(withoutTernaryOperator(a, b, c) + " is Greatest");
	}

}
