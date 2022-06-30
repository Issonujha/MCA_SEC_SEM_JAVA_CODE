package classjava;

import java.util.Scanner;

public class SumMatrices23 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[][] = new int[2][3];
		int arr2[][] = new int[2][3];
		int output[][] = new int[2][3];
		System.out.println("Enter the Elments for First 2X3 Array ");
		for(int i= 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.println("Enter the " + i + "th " + j + "th " + "index value");
				arr[i][j] = s.nextInt();
			}
		}
		System.out.println("Enter the Elments for Second 2X3 Array ");
		for(int i= 0; i<arr2.length; i++) {
			for(int j = 0; j<arr2[i].length; j++) {
				System.out.println("Enter the " + i + "th " + j + "th " + "index value");
				arr2[i][j] = s.nextInt();
			}
		}
		System.out.println("Summing two array....");
		for(int i= 0; i<arr2.length; i++) {
			for(int j = 0; j<arr2[i].length; j++) {
				output[i][j] = arr[i][j] + arr2[i][j];
			}
		}
		System.out.println("After Sum the result is ");
		for(int i = 0; i<output.length; i++) {
			for(int j = 0; j<output[i].length; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
	}

}
