package classjava;
import java.util.Scanner;
public class cgpa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Subject Marks: ");
		int sub1 = scanner.nextInt();
		System.out.println("Enter Second Subject Marks: ");
		int sub2 = scanner.nextInt();
		System.out.println("Enter Third Subject Marks: ");
		int sub3 = scanner.nextInt();
		System.out.println("Enter fourth Subject Marks: ");
		int sub4 = scanner.nextInt();
		System.out.println("Enter Third Subject Marks: ");
		int sub5 = scanner.nextInt();
		float total = sub1 + sub2 + sub3 + sub4 + sub5;
		float percent = (total/500)*100;
		System.out.println("Percent is " + percent);
		double cgpa = percent/9.5;
		System.out.println("CGPA is " + cgpa);
	}

}
