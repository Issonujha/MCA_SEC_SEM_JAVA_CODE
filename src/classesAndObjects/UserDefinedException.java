package classesAndObjects;

import java.util.Scanner;

public class UserDefinedException {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			throw new ZeroDivisionException();
		}
		catch(ZeroDivisionException e) {
			System.out.println("Caught");
		}
	}

}
class ZeroDivisionException extends Exception {
	
}