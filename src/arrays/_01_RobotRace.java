package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
		Robot[] iRobs = new Robot[5];
		// 3. use a for loop to initialize the robots.
		int posX = 100;
		for (int m = 0; m < iRobs.length; m++) {
			iRobs[m] = new Robot(posX, 450);
			iRobs[m].setSpeed(25);
			iRobs[m].miniaturize();
			// 4. make each robot start at the bottom of the screen, side by side, facing up
			posX += 100;
		}
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50
		Random ran = new Random();
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		int smallestY = 1000;
		int winner = 0;
		while (smallestY > 0) {
			for (int j = 0; j < iRobs.length; j++) {
				int r = ran.nextInt(50);
				iRobs[j].move(r);
				if (iRobs[j].getY() < smallestY) {
					smallestY = iRobs[j].getY();
					winner=j;
				}
			}
		}
		// 7. declare that robot the winner and throw it a party!
			System.out.println("Robot number: " + winner + " won!!!!!!!!");
		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.

	}
}
