package MathClass_Demo;

import java.util.Scanner;

public class Hypotenuse_Triangle {

	public static void main(String[] args) {
		double X;
		double Y;
		double Ans;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of side X ");
		X = input.nextDouble();
		System.out.println("Enter the value of side Y");
		Y = input.nextDouble();
		input.close();
		
		Ans = Math.sqrt((X*X)+(Y*Y));
		
		
		System.out.println("The Hypotenuse is " + Ans);
		

	}

}
