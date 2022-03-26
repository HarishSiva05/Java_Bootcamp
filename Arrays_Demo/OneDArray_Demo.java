package Arrays_Demo;

import java.util.Scanner;

public class OneDArray_Demo {

	public static void main(String[] args) {
		//Using String Array
		String cars[] = {"Tesla","BMW","Audi"};
		cars[0]="Corvette";
		for(int i=0; i<cars.length;i++) {
		System.out.println(cars[i]);
		}
		
		//Using Integer Array
		int arr[] = {1,2,3,4,5,6,7};
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
		
		//Without Initializing Array Elements
		Scanner input = new Scanner (System.in);
		int i = input.nextInt();
		input.close();
		String cars2 [] = new String[i];
		System.out.println(cars2.length);
		
		
	}

}
