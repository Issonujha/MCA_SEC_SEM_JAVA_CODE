package classjava;

import java.util.Scanner;
public class Non_Prime_Sum {
    
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        // System.out.println("Enter the size of array: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = s.nextInt();
        }
        int sum = 0;
        for(int i = 3; i<n; i++) {
            int a=2;
            while(a<i) {
                if(i%a==0) {
                    sum = sum + arr[i];
                    break;
                }
                else {
                    a++;
                    continue;
                }
            }
        }
        sum = sum +arr[0] + arr[1];
        System.out.println(sum);
    }
}