package classjava;

import java.util.Scanner;

public class AllPrimeInArray {
	public static boolean checkPrime(int data) {
		boolean b = false;
		for(int i = 2; i<=data/2; i++) {
			if(data%i==0) {
				return b;
			}
		}
		return true;
	}
	public static int[] incArray(int arr[]) {
		int newarr[] = new int[arr.length+1];
		for(int i = 0; i<arr.length; i++) {
			newarr[i] = arr[i];
		}
		return newarr;
	}
	public static int[] ReturnPrimeArray(int[] arr, int start, int end) {
//		int arrnew[] = new int[1];
//		int index = 0;
		for(int i = start; i<end; i++) {
			boolean b = checkPrime(arr[i]);
//			if(index==arrnew.length) {
//				arrnew = incArray(arrnew);
//			}
//			if(b==true) {
//				arrnew[index] = arr[i];
//				index++;
//			}
			if(b!=true) {
				arr[i] = 0;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for(int i = 0; i<size; i++) {
			System.out.println("Enter the "+ (i+1) + " element");
			arr[i] = s.nextInt();
		}
		System.out.println("Enter Start ");
		int start = s.nextInt();
		System.out.println("Enter End ");
		int end = s.nextInt();
		int prime[] = ReturnPrimeArray(arr, start, end);
		for(int i = 0; i<prime.length-1; i++) {
			if(arr[i] != 0) {
				System.out.println(prime[i]);
			}
//			int a = 4;
//			boolean b = checkPrime(a);
//			System.out.println(b);
		}
	}

}
