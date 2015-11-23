package day1.robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Personalrepeatshape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Robot eRobot=new Robot("batman");
String Answer=JOptionPane.showInputDialog("what shape");
if(Answer.equals("hexagon")){
	eRobot.turn(90);
	eRobot.penDown();
for (int i = 0; i < 6; i++) {
	eRobot.setRandomPenColor();
	eRobot.move(60);
	eRobot.turn(60);
}
	
	
}
if(Answer.equals("triangle")){
	eRobot.turn(90);
	eRobot.penDown();
for (int i = 0; i < 3; i++) {
	eRobot.setRandomPenColor();
	eRobot.move(200);
	eRobot.turn(120);
	
}
}
if(Answer.equals("octagon"))
	eRobot.turn(90);
	eRobot.penDown();
for (int i = 0; i < 8; i++) {
	eRobot.setRandomPenColor();
	eRobot.move(40);
	eRobot.turn(360/8);
}
	
	
	}

}
