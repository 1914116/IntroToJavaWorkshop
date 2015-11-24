package day3;

import javax.swing.JOptionPane;

public class Snooper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=JOptionPane.showInputDialog(null, "What is your full name?");
		String house=JOptionPane.showInputDialog("Where do you live?");
		String security=JOptionPane.showInputDialog("What is your Social Security Number?");
		String school=JOptionPane.showInputDialog("What school do you go to?");
		String alone=JOptionPane.showInputDialog("Are you alone?");
		String number=JOptionPane.showInputDialog("What is your phone number.");
		JOptionPane.showMessageDialog(null, "Well "+ name + "I know that you live "+ house + ",Your Social Security number is "+ security + "I know that you go to "+ school + "I know that you are alone" + "and Im going to kill you.");

	}

}
