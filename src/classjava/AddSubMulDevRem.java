package classjava;
import java.util.Scanner;
public class AddSubMulDevRem {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first Number: ");
		int a = s.nextInt();
		System.out.println("Enter Second Number: ");
		int b = s.nextInt();
		int sum = a + b;
		System.out.println(a + "+" + b +"="+ sum);
		int sub = a-b;
		System.out.println(a + "-" + b + "=" + sub);
		int mul = a*b;
		System.out.println(a + "*" + b + "=" + mul);
		double div = a/b;
		System.out.println(a + "/" + b + "=" + div);
		int mod = a%b;
		System.out.println(a +"mod"+ b +"="+ mod);
	}

}
