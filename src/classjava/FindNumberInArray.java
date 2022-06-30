package classjava;

import java.util.Scanner;

public class FindNumberInArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[] = new int[15];
		for(int i = 1; i<arr.length; i++) {
			arr[i] = i;
		}
		System.out.println("Enter the element to find in array ");
		int find = s.nextInt();
		for(int i = 0; i<arr.length; i++) {
			if(find==arr[i]) {
				System.out.println("Element found at " + (arr[i]+1) + "th position.");
				return;
			}
		}
		System.out.println("Element Not found.");
	}

}
