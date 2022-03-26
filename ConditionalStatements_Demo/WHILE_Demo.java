package ConditionalStatements_Demo;

import java.util.Scanner;

public class WHILE_Demo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String Name = "";
		//WHILE 
			while(Name.isEmpty()) {
			System.out.println("Enter your Name: ");
			Name = input.nextLine();
			}
		//DO WHILE
			
			 do{
				System.out.println("Enter your Name: ");
				Name = input.nextLine();
				}while(Name.isEmpty());
			
				System.out.println("Hello " +Name);

	}

}
