package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int Score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
				String Question1 = JOptionPane.showInputDialog("What was the name of the dark wizard that killed Harry Potter's parents?");
				// 3.  Use an if statement to check if their answer is correct
				if (Question1.equalsIgnoreCase("Voldemort")) {
					Score = Score += 1;
				}
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		String Question2 = JOptionPane.showInputDialog(null, "What is the name of the family that rasied Harry and how did they treat Harry?");
		if (Question2.equalsIgnoreCase("The Dursleys, and they treated Harry in a very unacceptable and cruel manner.")) {
		Score = Score += 1;
		}
		
		String Question3 = JOptionPane.showInputDialog(null, "Who introduced Harry about him and his family being a wizard and Harry getting accepted into Hogwarts?");
		if (Question3.equalsIgnoreCase("Hagrid")) {
			Score = Score += 1;
		}
		String Question4 = JOptionPane.showInputDialog(null, "What was the name of the Wizard's Shop?");
		if (Question4.equalsIgnoreCase("Diagon Alley")) {
			Score = Score += 1;
		}
		String Question5 = JOptionPane.showInputDialog(null, "What is the platform number for the Hogwarts express? Write in decimal format.");
			if (Question5.equalsIgnoreCase("9.75")) {
				Score = Score += 1;
			}
		// After all the questions have been asked, tell the user their final score 
		JOptionPane.showMessageDialog(null, Score);
	}
}
