package GUI_Demo;
import javax.swing.*;

public class GUI_Demo {

	public static void main(String[] args) {
		String Name = JOptionPane.showInputDialog("Enter your Name");
		JOptionPane.showMessageDialog(null,"Hello "+ Name);
		
		int Age = Integer.parseInt(	JOptionPane.showInputDialog("Enter your Age"));
		JOptionPane.showMessageDialog(null, "You are "+Age+" Years Old");
		
		String Charac = JOptionPane.showInputDialog("Describe yourself in one Word");
		JOptionPane.showMessageDialog(null,"You are "+Charac+" in Nature");
		
		Double Height = Double.parseDouble(JOptionPane.showInputDialog("Enter your Height in cm"));
		JOptionPane.showMessageDialog(null, "Your Height is "+Height+" cm.");
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
