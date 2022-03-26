package ConditionalStatements_Demo;

import java.util.Scanner;

public class NESTED_Demo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int Rows;
		int Columns;
		String Symbol="";
		System.out.println("Enter the Number of Rows: ");
		Rows = input.nextInt();
		System.out.println("Enter the Number of Columns: ");
		Columns = input.nextInt();
		System.out.println("Enter the Symbol: ");
		Symbol = input.next();
		
		for(int i = 1;i<=Rows;i++) {
			System.out.println();
			for(int j=1;j<=Columns;j++) {
				
				System.out.print(Symbol);
				
			}
		}
		

	}

}
