package Methods_Demo;

public class MethodsBasic_Demo {
	public static void main(String[] args) {
		
		//Method - A block of code that is executed whenever is called upon
		String name = "Harish";
		int age = 21;
		greetings(name,age);
		int x = 10;
		int y =10;
		System.out.println(add(x,y));
	
		
	}
	static void greetings(String name, int age) {
		System.out.println("Welcome "+name);
		System.out.println("You are "+age+" Years Old");
	}
	
	static int add(int x, int y) {
		return x+y;
	}
	

}
