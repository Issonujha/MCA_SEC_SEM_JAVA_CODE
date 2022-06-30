package classjava;
import java.util.Scanner;
public class ConfidentialTodata {
	public static int[] findOrigionalFirstAndSum(int[]arr, int n) {
		if(arr.length==0 || arr.length==1) {
			return arr;
		}
		int output[] = new int[n];
		for(int i = n-1; i>=0; i--) {
			if(i==n-1) {
				output[i] = arr[i];
				continue;
			}
			int diff = arr[i] - output[i+1];
			output[i] = diff;
		}
		return output;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n = s.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the confidential Number: ");
		for(int i = 0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		int [] output = findOrigionalFirstAndSum(arr, n);
		for(int i = 0; i<arr.length; i++) {
			System.out.print(output[i] + " ");
		}
	}
}