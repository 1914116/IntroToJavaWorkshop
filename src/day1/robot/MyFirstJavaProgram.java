package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
		Robot evilRobot=new Robot("batman");
		evilRobot.setSpeed(2000);
		evilRobot.move(490);
		evilRobot.penDown();
		evilRobot.setAngle(140);
		evilRobot.setPenWidth(10);
		evilRobot.turn(180);
		evilRobot.setPenColor(Color.RED);
		Robot eRobot=new Robot("june");
		eRobot.move(200);
		eRobot.turn(90);
		eRobot.penDown();
		eRobot.setPenWidth(400);
		eRobot.setPenColor(Color.ORANGE);
		eRobot.move(350);
		Robot tRobot=new Robot();
		tRobot.move(250);
		tRobot.turn(-90);
		tRobot.penDown();
		tRobot.setRandomPenColor();
		tRobot.move(-350);
		Robot gRobot=new Robot();
		
		

	
		
		
	}
}
