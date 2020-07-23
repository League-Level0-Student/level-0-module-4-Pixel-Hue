package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class Test_Scores {
public static void main(String[] args) {
	
	String testAns = JOptionPane.showInputDialog("What is your test score?");
	Double a = Double.parseDouble(testAns);
	if (a >= 100.00) {
		JOptionPane.showMessageDialog(null, "Impossible!");
		
	}
	else if (a >= 90.00) {
		JOptionPane.showMessageDialog(null, "Good job!");
		
	}
	else if (a >= 80.00) {
		JOptionPane.showMessageDialog(null, "Good!");
		
	}
	else if (a >= 70.00) {
		JOptionPane.showMessageDialog(null, "Ok decent");
		
	}
	else if (a >= 60.00) {
		JOptionPane.showMessageDialog(null, "Okay");
		
	}
	else if (a >= 50.00) {
		JOptionPane.showMessageDialog(null, "You can do better");
		
		
	}
	else if (a >= 40.00) {
		JOptionPane.showMessageDialog(null, "Study more!");
		
	}
	else if (a >= 30.00) {
		JOptionPane.showMessageDialog(null, "Did you study?");
		
	}
else if (a >= 20.00) {
		JOptionPane.showMessageDialog(null, "Try harder");
		
	}
	else if (a >= 10.00) {
		JOptionPane.showMessageDialog(null, "Just try next time");
		
	}
	else if (a >= 0.00) {
		JOptionPane.showMessageDialog(null, "HOW???????");
		
	}
}
}
