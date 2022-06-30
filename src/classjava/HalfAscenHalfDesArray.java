package classjava;

public class HalfAscenHalfDesArray {
	public static int[] sortleft(int[]arr, int start, int end) {
		if(end==0) {
			return new int[0];
		}
		for(int i = 0; i<=end; i++) {
			for(int j = 0; j<=end; j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	public static int[] sortright(int[]arr, int start, int end) {
		if(end==0) {
			return new int[0];
		}
		for(int i = start; i<=end; i++) {
			for(int j = start; j<=end; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7, 5, 4, 9, 6, 12, 8};
		int last = arr.length-1;
		int mid = (arr.length/2)-1;
		int left[] = sortleft(arr, 0, mid);
		int right[] = sortright(arr, mid+1, last);
		int i = 0;
		for(; i<left.length; i++) {
			arr[i] = left[i];
		}
		int j = 0;
		for(; i<right.length && j<right.length; i++) {
			arr[i] = right[j];
			j++;
		}
		for(int k = 0; k<arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}

}
