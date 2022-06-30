package classjava;

import java.text.DecimalFormat;

public class FloatArraySum {

	public static void main(String[] args) {
		double []arr = {5.5,6.8, 7.9, 6.3, 5.2};
		double sum = 0.0;
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
		DecimalFormat format = new DecimalFormat("#.00");
		System.out.println("Sum of floats is " + format.format(sum));
	}

}
