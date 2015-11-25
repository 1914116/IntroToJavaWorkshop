package day3;

import javax.swing.JOptionPane;

public class Greeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String answer= JOptionPane.showInputDialog(null, "What is your name?");
		JOptionPane.showMessageDialog(null, "Hello "+answer);
		String solution= JOptionPane.showInputDialog(null, "That is a terrible name. How are you?");
		if (answer.equals("Good")){
			JOptionPane.showInputDialog(null, "Wow, thats disappointing");
		}
		if(answer.equals("Bad")){
			JOptionPane.showInputDialog(null, "I Really Don't Care");
		}
	}


}
