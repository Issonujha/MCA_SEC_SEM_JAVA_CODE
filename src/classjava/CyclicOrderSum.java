package classjava;

import java.util.Scanner;

public class CyclicOrderSum {
	public static int CyclicSum(int n) {
		String s = String.valueOf(n);
		int sum = 0;
		for(int i = 0; i<s.length(); i++) {
			for(int j = i; j<s.length(); j++) {
				int ch = s.charAt(j);
				sum += ch - '0';
			}
		}
		return sum;
	}
	public static int count(int n) {
		int count = 0;
		while(n>0) {
			count++;
			n = n/10;
		}
		return count;
	}
	public static void CyclicSumUsingArray(int n) {
		int arr[] = new int[count(n)];
		int a = n;
		int index = arr.length-1;
		while(a>0) {
			int d = a%10;
			arr[index] = d;
			index--;
			a = a/10;
		}
		int sum = 0;
		int b = 0;
		for(int i = b; i<arr.length; i++) {
			sum += arr[i];
			if(i==arr.length-1) {
				i=++b;
				i--;
			}
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
//		num = CyclicSum(num);
		System.out.println(num);
		CyclicSumUsingArray(num);
	}

}