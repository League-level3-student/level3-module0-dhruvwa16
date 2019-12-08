package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		//2. create an array of 5 robots.
			Robot[] robots = new Robot[5];
		//3. use a for loop to initialize the robots.
			for (int i = 0; i < robots.length; i++) {
				robots[i] = new Robot();
				robots[i].setX(100*i+230);
				robots[i].setY(520);
				robots[i].turn(45);
			}
					

			//4. make each robot start at the bottom of the screen, side by side, facing up
	
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount
				
					
					
			for (int i = 0; i < 100; i++) {
				boolean run = true;
				if(robots[i].getY() <0) {
					run = false;
				}
				while(run == true) {
					Random r = new Random();
					int num = r.nextInt(401);
					robots[i].move(num);
					i++;
					if(robots[i].getY() <0) {
						run = false;
					}
					i++;
					if(i==4) {
						i=0;
					}

					if(robots[i].getY() <0) {
						run = false;
					
				}
				int a = i-1;
				System.out.println("Robot" +a );

			}
	
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.
				

}
}
}