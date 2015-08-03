package day1.robot;



import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE

	Robot sarika =new Robot();
	sarika.penDown();
	sarika.setPenColor(Color.BLUE);
	for (int i = 0; i < 4; i++) {
		sarika.move(276);
		sarika.turn(90);
	}





	}
	}
