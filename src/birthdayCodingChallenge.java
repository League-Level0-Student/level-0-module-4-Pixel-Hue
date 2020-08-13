import javax.swing.JOptionPane;

public class birthdayCodingChallenge {
public static void main(String[] args) {
	//Print "Happy Birthday" AGE times
	String Age = JOptionPane.showInputDialog("How old are you?");
	int num = Integer.parseInt(Age);
	for (int i = 0; i < num; i++) {
		System.out.println("Happy Birthday");
	}
	System.out.println("That's how many birthday wishes I owe you!");
}
}
