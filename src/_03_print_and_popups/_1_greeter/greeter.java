package _03_print_and_popups._1_greeter;

import javax.swing.JOptionPane;

public class greeter {
public static void main(String[] args) {
	System.out.println("Hello World");
	String Eclipse = JOptionPane.showInputDialog("What is your name?");
	JOptionPane.showMessageDialog(null, "Hello my name is " + Eclipse);
}
}
