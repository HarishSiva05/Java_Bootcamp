package Arrays_Demo;

public class TwoDArray_Demo {
	// 2D arrays is just array of arrays.

	public static void main(String[] args) {
		//Initialize Directly 
		String Apple1[][] = {{"iPhone","iPad"},
							 {"iMac","MacMini"}};
		// Initialize using Address
		String Apple[][] = new String[2][2];
		Apple[0][0] = "iPhone";
		Apple[0][1] = "iPad";
		Apple[1][0]= "iMac";
		Apple[1][1] = "MacMini";
//		Apple[2][0] = "AirPods";
//		Apple[2][1] = "AppleWatch";
		
		for(int i =0;i<Apple1.length;i++) {
			System.out.println();
			for(int j=0;j<Apple1[i].length;j++) {
				
				System.out.print(Apple1[i][j]+" ");
				
			}
		}
		

	}

}
