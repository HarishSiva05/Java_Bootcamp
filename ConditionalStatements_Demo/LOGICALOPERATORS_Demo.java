package ConditionalStatements_Demo;

import java.util.Scanner;

public class LOGICALOPERATORS_Demo {

	public static void main(String[] args) {
		// Logical Operators are used to connect TWO or MORE Expressions
		// && - Both Conditions must be true
		// || - Either One of the Conditions must be true
		// ! - Reverse the Boolean value of the Condition
		
		int Temperature = 30;
		if(Temperature >= 31) {
			System.out.println("It's Hot Outside");
		}
		else if(Temperature >=20 && Temperature <= 30) {
			System.out.println("It's Kinda Warm Outside");
		}
		else {
			System.out.println("It's Cold Outide");
		}
		

		
		Scanner input = new Scanner(System.in);
		System.out.println("Press 'q' or 'Q' to quit the game");
		String response = input.nextLine();
		// To check the string we need to use .equals
		if(response.equals("q")||response.equals("Q")) {
			System.out.println("You've quitted, thanks for playing the game");
			
		}
		else {
			System.out.println("You are Still in the Game");
		}
		
		
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("Press 'q' or 'Q' to quit the game");
		String response1 = input1.nextLine();
		// To check the string we need to use .equals
		if(!response1.equals("q") && !response1.equals("Q")) {
			System.out.println("You are still in the Game");
			
		}
		else {
			System.out.println("You've Quitted");
		}
		
		
	}

}
