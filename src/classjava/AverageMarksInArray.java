package classjava;

import java.util.Scanner;

public class AverageMarksInArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no of students ");
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i =0; i<arr.length; i++) {
			System.out.println("Enter the " + (i+1) +"th student marks in physics ");
			arr[i] = s.nextInt();
		}
		int sum = 0;
		double avg = 0.0;
		for(int i:arr) {
			sum +=i;
		}
		avg = sum/arr.length;
		System.out.print("Average of physics marks is " + avg);
	}

}
