package classjava;

import java.util.Scanner;

public class Fibonacci {
	public static void fibo(int element) {
		if(element==0) {
			System.out.println("0");
			return;
		}
		if(element==1) {
			System.out.println("1");
			return;
		}
		int a = 0;
		int b = 1;
		System.out.print(a + " " + b + " ");
		int i = 2;
		while(i<element) {
			int temp = a;
			a = b;
			b = temp+b;
			System.out.print(b + " ");
			i++;
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no of series you want ");
		int elem = s.nextInt();
		fibo(elem);
	}

}
