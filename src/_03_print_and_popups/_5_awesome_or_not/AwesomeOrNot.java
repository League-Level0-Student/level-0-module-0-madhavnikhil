package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes everything below
public static void main(String[] args) {
	

	
		Random ran = new Random();    //This will be used below to make a random number. 
		
		// 2. Make a variable that will hold a random whole number
		int vari = ran.nextInt(4);
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
	
		// 3. Print your variable to the console
		System.out.println(vari);
		// 4. Get the user to enter something that they think is awesome
		String User = JOptionPane.showInputDialog(null, "Enter something that you think is awesone.");
		// 5. If your variable is  0
	if (vari == 0) {
		JOptionPane.showMessageDialog(null, "What you have entered is awesome.");
	}
			// -- tell the user whatever they entered is awesome!
	
		// 6. If your variable is  1
	if (vari == 1) {
		JOptionPane.showMessageDialog(null, "What you have entered is ok.");
	}
			// -- tell the user whatever they entered is ok.
	
		// 7. If your variable is  2
	if (vari == 2) {
		JOptionPane.showMessageDialog(null, "What you entered is boring?");
	}
			// -- tell the user whatever they entered is boring.
	
		// 8. If your variable is  3
	if (vari == 3) {
		JOptionPane.showMessageDialog(null, "Be nice");
	}
			// -- invent your own message to give to the user (be nice).

}
}
