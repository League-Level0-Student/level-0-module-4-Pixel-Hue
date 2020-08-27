package _99_extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
String a = JOptionPane.showInputDialog("Write a number");
int b = Integer.parseInt(a);
String c = JOptionPane.showInputDialog("Write another number");
int d = Integer.parseInt(a);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "Which math term would you like to use?", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "+ (Plus)", "- (Minus)", "x (Multiplication)", "÷ (Division)" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
		//Use int operation to call the methods
			plus(b, d);
			minus(b, d);
			multiplication(b, d);
			division(b, d);
		
		
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}
	
	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
static void plus(int b, int d) {
	int aa = 0;
	aa+=b;
	aa+=d;
	
	JOptionPane.showMessageDialog(null, "" + b + " + " + d + " = " + aa);
}
static void minus(int b, int d) {
	int aa = 0;
	aa+=b;
	aa-=d;
	
	JOptionPane.showMessageDialog(null, "" + b + " - " + d + " = " + aa);
}
static void multiplication(int b, int d) {
	int aa = 0;
	aa+=b;
	aa*=d;
	
	JOptionPane.showMessageDialog(null, "" + b + " x " + d + " = " + aa);
}
static void division(int b, int d) {
	int aa = 0;
	aa+=b;
	aa/=d;
	
	JOptionPane.showMessageDialog(null, "" + b + " ÷ " + d + " = " + aa);
}
	// 4. Create similar methods for subtraction, multiplication and division.
	
}