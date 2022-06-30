package classjava;
import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the salary in year: ");
		int salary = s.nextInt();
		int tax = 0;
		int actualSalary = 0;
		if(salary>=250000 && salary<500000) {
			tax = 5;
			actualSalary = actualSalary + (salary- (salary*tax/100));
		}
		else if(salary>=500000 && salary<100000) {
			tax = 20;
			actualSalary = actualSalary + (salary- (salary*tax/100));
		}
		else {
			tax = 30;
			actualSalary = actualSalary + (salary- (salary*tax/100));
		}
		System.out.println("Actual Salary is : " + actualSalary);
	}

}
