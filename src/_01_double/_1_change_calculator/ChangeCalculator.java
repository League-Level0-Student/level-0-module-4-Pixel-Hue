package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String Ans = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int. Hint: Integer.parseInt()
		
        int a = Integer.parseInt(Ans);
	
        String Ans2 = JOptionPane.showInputDialog("How many dimes do you have?");
		// Ask the user how many quarters they have, and convert their answer
        int b = Integer.parseInt(Ans2);
        String Ans3 = JOptionPane.showInputDialog("How many quarters do you have?");
		
        int c = Integer.parseInt(Ans3);
        
        
        double answer = a * 0.05 + b * 0.1 + c * 0.25;
        double ans = answer;
        
       
		// Calculate how much money the user has. Hint: Use a double variable
        
       
      JOptionPane.showMessageDialog(null, "You have " + ans);
		// Tell the user how much money they have in dollars and cents format (e.g.
		// $6.75)

	}
}
