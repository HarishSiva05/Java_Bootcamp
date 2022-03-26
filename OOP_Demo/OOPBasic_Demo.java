package OOP_Demo;

public class OOPBasic_Demo {

	public static void main(String[] args) {
		
		// Object - it is an instance of a class that may contains methods and attributes
		// Example - Real World Objects
		
		Car myCar = new Car();
		System.out.println(myCar.CarName);
		//You can't print a Method 
		//System.out.print(myCar.Ludicrous());
		myCar.AutoPilot();

	}

}
