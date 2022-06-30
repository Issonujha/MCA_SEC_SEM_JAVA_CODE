package games;
import java.util.Random;
import java.util.Scanner;
public class Random1{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Selected randomly ");
		Random random = new Random(3);
		int computerInput = random.nextInt(3);
		System.out.println(computerInput);
}
}
