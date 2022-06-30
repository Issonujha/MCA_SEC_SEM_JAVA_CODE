package classjava;

import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the No of elements ");
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i<arr.length; i++) {
			System.out.println("Enter the " + (i+1) +"th element");
			arr[i] = s.nextInt();
		}
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				if(arr[j]>arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("After Sorting... ");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
