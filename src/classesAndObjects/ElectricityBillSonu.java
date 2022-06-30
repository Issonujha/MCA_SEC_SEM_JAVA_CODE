package classesAndObjects;

import java.util.Scanner;

public class ElectricityBillSonu {

	public static void main(String[] args) {
		Electricity e = new Electricity();
		e.getData();
		e.fetchBill();
		e.display();
	}

}

class Electricity {
	Scanner s = new Scanner(System.in);
	Scanner s1 = new Scanner(System.in);
	int cno;
	String cname;
	double pmr;
	double cmr;
	String type;
	double tbill;
	double unit;
	public void getData() {
		System.out.println("Enter the consumer no: ");
		this.cno = s.nextInt();
		System.out.println("Enter the consumer name: ");
		this.cname = s1.nextLine();
		System.out.println("Enter the consumer Previous Month Reading: ");
		this.pmr = s.nextDouble();
		System.out.println("Enter the consumer Current Months Reading: ");
		this.cmr = s.nextDouble();
		System.out.println("Enter the consumer type(d for domestic & c for commercial): ");
		this.type = s1.nextLine();
	}
	
	public void fetchBill() {
		unit = cmr-pmr;
		System.out.println(unit);
		if(type.equals("d")) {
			if(unit<=100) {
				tbill = 1*unit;
			}
			else if(unit>100 && unit<=200) {
				tbill = 2.5*unit;
			}
			else if(unit>200 && unit<=500) {
				tbill = 4*unit;
			}
			else if(unit>500) {
				tbill = 6*unit;
			}
		}
		else {
			if(unit<=100) {
				tbill = 2*unit;
			}
			else if(unit>100 && unit<=200) {
				tbill = 4.5*unit;
			}
			else if(unit>200 && unit<=500) {
				tbill = 6*unit;
			}
			else if(unit>500) {
				tbill = 7*unit;
			}
		}
	}
	void display() {
		System.out.println("Consumer No: "+ cno);
		System.out.println("Consumer Name: "+ cname);
		System.out.println("Previous month reading: "+ pmr);
		System.out.println("Current month reading: "+ cmr);
		System.out.println("Type: "+ type);
		System.out.println("Total unit: "+ unit);
		System.out.println("total bill: "+ tbill);
	}
}