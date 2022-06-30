package classjava;

public class ArrayPalindrome {
	public static boolean checkPelindrome(int element) {
		int temp = element;
		int number = 0;
		while(temp>0) {
			int rem = temp%10;
			number = number +rem;
			number = number*10;
			temp = temp/10;
		}
		number = number/10;
//		System.out.println(number + " " +element);
		if(number==element) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {110, 222, 121, 000};
		boolean res = false;
		for(int i = 0; i<arr.length; i++) {
			res = checkPelindrome(arr[i]);
			if(res == false) {
				break;
			}
			else {
				continue;
			}
		}
		System.out.println(res);
	}
}
