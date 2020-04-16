package _01_robot._2_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffati {
	public static void main(String[] args) {
		
		Robot Nick = new Robot();
		    Nick.penDown();
		    Nick.setSpeed(100);
		    Nick.move(100);
		    Nick.turn(140);
		
		    Nick.move(100);
		    Nick.turn(-140);
		    Nick.move(100);
	}
	
	
}