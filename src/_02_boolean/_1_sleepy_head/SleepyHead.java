package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend;
		// Write code to ask the user what day it is.
        String Ans1 = JOptionPane.showInputDialog("What day is it?");
        if (Ans1.equalsIgnoreCase("Saturday")) {
        	isWeekend = true;
        	
        }
        else if (Ans1.equalsIgnoreCase("Sunday")) {
        	isWeekend = true;

        }
		// Set the boolean isWeekend based on the value they enter
        else{
        	isWeekend = false;
        	
        }
		
		// If it is the weekend, tell the user they get to sleep in.
		if (isWeekend == true) {
			JOptionPane.showMessageDialog(null, "You get to sleep in!");
		}
		// If it is not the weekend, tell them to get out of bed and go to school!
		else if (isWeekend ==false) {
			JOptionPane.showMessageDialog(null, "Get out of bed and go to school!");
		}
		
		/************************   STAR STUDENT  **************************/

		boolean passedExam;
		// Write code to ask the user what percentage they scored in their last exam
		String Ans2 = JOptionPane.showInputDialog("What percentage did you score on your last exam?");
		int num = Integer.parseInt(Ans2);
		if (num >= 70) {
			passedExam = true;
		}
		else {
			passedExam = false;
		}
				if (passedExam = true) {
					JOptionPane.showMessageDialog(null, "Congragulations!");
				}
				else if (passedExam = false) {
					JOptionPane.showMessageDialog(null, "You didn't pass :/ , but hey at least you tried. Better luck next time.");
				}
				


// If they scored more than 70, they passed the exam.
// Set the boolean passedExam based on their score.

// If the user passed the exam, congratulate them
		
		// otherwise, wish them better luck next time.
		
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is game over");
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;
			
			// If they answer "yes", change gameIsOver to true

		}
		// Tell the user "game is over" 
		if (gameIsOver == true) {
			JOptionPane.showMessageDialog(null, "game is over");
		}
		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		String ans3 = JOptionPane.showInputDialog(null, "What color do you want to draw with?");
		if (ans3.equalsIgnoreCase("red") ){
			isRed = true;
		}
		else {
			isRed = false;
		}
		boolean isSquare;		
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		String ans4 = JOptionPane.showInputDialog(null, "What shape do you want to draw?");
		if (ans4.equalsIgnoreCase("square") ){
			isSquare = true;
		}
		else {
			isSquare = false;
		}
		if (isSquare && isRed == true) {
			drawRedSquare();
		}
		else if (isSquare == true) {
			JOptionPane.showMessageDialog(null, "I don't know that color");
		}
		else if (isRed == true) {
			JOptionPane.showMessageDialog(null, "I don't know how to draw that shape");
		}
		else {
			JOptionPane.showMessageDialog(null, "Which color is that and I don't know how to draw that shape");
		}
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		

	}

	
	static void drawRedSquare() {
		Robot rob = new Robot();
		rob.penDown();
		rob.setPenColor(255, 0, 0);
		for (int i = 0; i < 4; i++) {
			rob.move(50);
			rob.turn(90);
		}
			}


	
	
}
