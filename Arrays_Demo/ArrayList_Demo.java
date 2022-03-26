package Arrays_Demo;

import java.util.*;

public class ArrayList_Demo {

	
	// Array List - a resizable array
	// Elements can be added and removed after compilation phase.
	// Stores Reference Datatypes
	
	
	public static void main(String[] args) {
		
		// ArrayList<> - Inside the angular brackets we will be placing the appropriate Wrapper Class instead of Primitive ones.
		
		ArrayList<String> Chocolate = new ArrayList<String>();
		
		// Add elements in the List
		Chocolate.add("Kit-kat");
		Chocolate.add("Ferro-Roacher");
		Chocolate.add("Skittles");
		
		// Update Elements in the List
		Chocolate.set(2, "Snickers");
		Chocolate.remove(1);
		//Chocolate.clear();
		
		// Print the list
		
		//System.out.println(Chocolate);
		for(int i = 0; i<Chocolate.size(); i++) {
			System.out.println(Chocolate.get(i));
		}
		
		
		

	}

}
