package _03_input_dialog._3_last_summer;

import javax.swing.JOptionPane;

public class LastSummer {
public static void main(String[] args) {
	String Nikhil = JOptionPane.showInputDialog("What is your name?");
	JOptionPane.showMessageDialog(null, "Hey, " + Nikhil + " I know that you want to travel to the Bahamas or Hawaii this summer?");
}
}
