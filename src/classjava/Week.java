package classjava;
import java.util.Scanner;
public class Week {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the date: ");
		int a = s.nextInt();
		switch(a) {
		case 1: System.out.println("It is MONDAY.");
		break;
		case 2: System.out.println("It is TUESDAY.");
		break;
		case 3: System.out.println("It is WEDNESDAY.");
		break;
		case 4: System.out.println("It is THURSDAY.");
		break;
		case 5: System.out.println("It is FRIDAY.");
		break;
		case 6: System.out.println("It is SATURDAY.");
		break;
		case 7: System.out.println("It is SUNDAY.");
		break;
		default:System.out.println("Wrong!!");
		}

	}

}
