package classjava;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n%2==0) {
			System.out.println("Cannot reverse");
			return;
		}
		int sum = 0;
		while(n>0) {
			int temp = n%10;
			sum += temp;
			sum *=10;
			n = n/10;
		}
		System.out.println(sum/10);
	}

}
