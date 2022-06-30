package games;
import java.util.Random;
import java.util.Scanner;
public class StonePaperScissor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 0 for Rock or 1 for Scissor or 2 for paper");
		int userInput = s.nextInt();
		Random random = new Random(3);
		int computerInput = random.nextInt(3);
		System.out.println(computerInput);
		if(userInput==computerInput) {
			System.out.println("Draw");
		}
		else if((userInput == 0 && computerInput==1) || (userInput == 1 && computerInput==2) || (userInput == 2 && computerInput== 0)) {
			System.out.println("User wins");
		}
		else {
			System.out.println("Computer wins");
		}
		
	}

}
