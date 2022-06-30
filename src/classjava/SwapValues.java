package classjava;

public class SwapValues {
	public static void swapValuesUsingThirdVariables(int m, int n) {
		int temp = m;
		m = n;
		n = temp;
		System.out.println("The values of m is "+ m + " and the value of n is "+ n);
	}
	public static void main(String[] args) {
		int m = 9, n = 10;
		
		swapValuesUsingThirdVariables(m, n);

	}

}
