package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Eli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Robot eRobot=new Robot("june");
eRobot.setSpeed(10);
eRobot.turn(90);
eRobot.setPenColor(Color.GREEN);
eRobot.setPenWidth(500);
eRobot.penDown();
eRobot.move(400);
eRobot.turn(-120);
eRobot.move(400);
eRobot.turn(-120);
eRobot.move(400);
eRobot.penUp();
eRobot.turn(150);
eRobot.move(120);
eRobot.turn(90);
eRobot.move(140);
eRobot.penDown();
eRobot.setPenColor(Color.BLACK);
eRobot.setPenWidth(250);
eRobot.turn(90);
eRobot.setSpeed(10);
for (int i = 0; i < 360; i++)
{
eRobot.move(1);
eRobot.turn(-1);
}
}

}
