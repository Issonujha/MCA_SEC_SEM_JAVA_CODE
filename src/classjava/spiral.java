package classjava;

import java.util.Scanner;
import java.util.NoSuchElementException;
public class spiral {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = s.nextInt();
        int arr[][] = new int[n][n];
        int sI = 0;
        int eI = arr[0].length-1;
        int col = 0;
        System.out.println("Enter the Elements: ");
        for(int i = sI; i<arr.length; i++) {
            for(int j = sI; j<arr[i].length; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        int length = arr.length+1;
        int count = 0;
        for(int i = sI, j = sI; i<arr.length && j<arr[0].length && count<n*n; ) {
        	count++;
            System.out.print(arr[i][j] + " ");
            if(i==sI) {
            	j++;
            	if(j==eI+1) {
            		j--;
            		i++;
            		length--;
            	}
            }
            else if(j==eI) {
            	i++;
            	if(i==length) {
            		i--;
            		j--;
            	}
            }
            else if(i==length-1) {
            	j--;
            	if(j==sI-1) {
            		j++;
            		sI++;
            		eI--;
            		i--;
            	}
            }
            else if(j==sI-1) {
            	i--;
            	if(i==sI-1) {
            		i++;
            		j++;
            	}
            }
            
        }
    }
}