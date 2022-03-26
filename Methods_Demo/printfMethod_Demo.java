package Methods_Demo;

public class printfMethod_Demo {

	public static void main(String[] args) {
		
		String Name = "Harish"; 	// %s
		int age = 20;				// %d
		char c = '@';				// %c
		double Salary = 700000.00;	// %f
		
		
		System.out.printf("Your Salary is %f\n",Salary);
		System.out.printf("Your Name is %s and you are %d years old\n",Name,age);
		System.out.printf("Your Symbol is %c\n",c);
		
		

	}

}
