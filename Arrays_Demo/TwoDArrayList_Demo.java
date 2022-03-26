package Arrays_Demo;

import java.util.*;
public class TwoDArrayList_Demo {

	public static void main(String[] args) {
		
		//2D Array List - a Dynamic List of Lists.
		// You can change the size of the list in runtime
		ArrayList<ArrayList<String>> Mall = new ArrayList();
		
		ArrayList<String> Chocolate = new ArrayList<String>();
		
		// Add elements in the List
		Chocolate.add("Kit-kat");
		Chocolate.add("Ferro-Roacher");
		Chocolate.add("Skittles");
		
		ArrayList<String> Beverages = new ArrayList<String>();
		
		// Add elements in the List
		Beverages.add("Soda");
		Beverages.add("Tea");
		Beverages.add("Coffee");
		
		ArrayList<String> Electronics = new ArrayList<String>();
		
		// Add elements in the List
		Electronics.add("iPhone's");
		Electronics.add("iPad's");
		Electronics.add("MacBooks");
		
		Mall.add(Electronics);
		Mall.add(Beverages);
		Mall.add(Chocolate);
		
		System.out.println(Mall.get(0).get(0));

	}

}
