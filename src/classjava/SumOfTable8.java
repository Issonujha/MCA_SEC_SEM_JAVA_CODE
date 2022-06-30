package classjava;

import java.util.Scanner;

public class SumOfTable8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the table no to take sum ");
		int n = s.nextInt();
		int sum = 0;
		for(int i = 1; i<=10; i++) {
			sum += n*i;
		}
		System.out.println("Sum of "+ n + "th table is " + sum);
	}

}
