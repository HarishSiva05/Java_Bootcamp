package Methods_Demo;

public class OverloadedMethods_Demo {

	public static void main(String[] args) {
		
		// Overloaded Methods = Methods that share the same name but have different parameters
		// Method name + Parameters = Method Signature.
		double z = add(10.0,12.0);
		System.out.println(z);

	}
	static int add(int x, int y) {
		System.out.println("Method #1 is being used");
		return x+y;
	}
	static int add(int x, int y,int z) {
		System.out.println("Method #2 is being used");
		return x+y+z;
	}
	static int add(int x, int y, int z, int w) {
		System.out.println("Method #3 is being used");
		return x+y+z+w;
	}
	static double add(double x, double y) {
		System.out.println("Method #4 is being used");
		return x+y;
	}

}
