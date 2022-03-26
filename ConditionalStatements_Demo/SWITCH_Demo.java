package ConditionalStatements_Demo;

public class SWITCH_Demo {

	public static void main(String[] args) {
	//Without Using String Array
		//String Day = "Sunday";
	// Using String Array
		String[] Day = {"Sunday","Monday","Tuesday","Thursday","Friday","Saturday"};
		
		switch(Day[3]) {
		case "Sunday": System.out.println("It's Sunday");
		break;
		case "Monday": System.out.println("It's Monday");
		break;
		case "Tuesday": System.out.println("It's Tuesday");
		break;
		case "Wednesday": System.out.println("It's Wedensday");
		break;
		case "Thursday": System.out.println("It's Thursday");
		break;
		case "Friday": System.out.println("It's Friday");
		break;
		case "Saturday": System.out.println("It's Saturday");
		break;
		}

	}

}
