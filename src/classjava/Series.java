package classjava;
import java.util.*;
public class Series {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[] = new int[4];
		arr[0] = 0;
		arr[1] = 0;
		arr[2] = 7;
		arr[3] = 6;
		int n = s.nextInt();
		int arrfinal[] = new int[n];
		for(int i = 0; i<arr.length; i++) {
			arrfinal[i] = arr[i];
		}
		int j = 2;
		int k = 3;
		for(int i = 4; i<arrfinal.length; i++) {
			if(i%2!=0) {
				int a = arr[3]*j;
				arrfinal[i] = a;
				j++;
			}else {
				int a = arr[2]*j;
				arrfinal[i] = a;
				k++;
			}
			
		}
//		for(int i = 0; i<arrfinal.length; i++) {
//			System.out.print(arrfinal[i] + " ");
//		}
//		System.out.println();
		System.out.println(arrfinal[n-1]);
	}

}
