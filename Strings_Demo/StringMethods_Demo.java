package Strings_Demo;

public class StringMethods_Demo {

	public static void main(String[] args) {
		// String - is a reference data type that can store one or more characters
		// Reference Data type has access to useful methods.
		
		String name = "Harish";
		boolean result = name.equals("Harish");
		boolean result2 = name.equalsIgnoreCase("harISH");
		System.out.println(result2);

		int result3 = name.length();
		System.out.println(result3);
		
		char result4 = name.charAt(4);
		System.out.println(result4);
		
		int result5 = name.indexOf("i");
		System.out.println(result5);
		
		boolean result6 = name.isEmpty();
		System.out.println(result6);
		
		String result7 = name.trim();
		System.out.println(result7);
	}

}
