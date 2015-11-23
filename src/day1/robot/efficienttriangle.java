package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class efficienttriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot eRobot=new Robot("batman");
		eRobot.penDown();
		eRobot.turn(90);
		eRobot.setSpeed(10);
		for (int i = 0; i < 360; i++)
		{
		eRobot.move(1);
		eRobot.turn(-1);
		}

	}

}
