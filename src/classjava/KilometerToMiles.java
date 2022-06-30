package classjava;
import java.util.Scanner;
public class KilometerToMiles {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value in Kilometer ");
		int kilometer = s.nextInt();
		float miles = kilometer*0.62f;
		System.out.println(kilometer+ " Kilometer = " + miles + " Miles");
	}
}
