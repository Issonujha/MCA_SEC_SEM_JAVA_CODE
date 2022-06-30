package classjava;

import java.util.Scanner;

public class TaxPaid {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Salary ");
		int salary = s.nextInt();
		double actualSalary = salary;
		int tax = 0;
		if(salary>250000 && salary<=500000) {
			tax = 5;
		}
		else if(salary>500000 && salary<=1000000) {
			tax = 20;
		}
		else if(salary>1000000) {
			tax = 30;
		}
		System.out.println("Your tax is " + tax + "% ");
		System.out.println("So your actual salary is ");
		double taxAmount = actualSalary*tax/100;
		actualSalary-=taxAmount;
		System.out.println(actualSalary);
	}

}
