package optional;

import java.util.Random;

import javax.swing.JFrame;

import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandOfTurtles {

	public static void main(String[] args) {

		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";

		// 1. Instantiate a JFrame object & make it visible

		// 2. Add the panel to the frame

		// 3. Set the background image of the panel to the Galapagos Islands

		// 4. Set the size image of the frame to 600 by 400

		// 5. Instantiate a Turtle

		// 6. Add the turtle to the panel

		// 7. Put 50 Turtles on the beach

		final int frameWidth = 600;
		final int frameHeight = 400;
		
		JFrame frame = new JFrame("Land of Turtles");
		frame.setVisible(true);
		frame.getContentPane().add(panel);
		panel.setBackgroundImage(galapagosIslands);
		frame.setSize(frameWidth, frameHeight);
		Turtle turtle = new Turtle();
		panel.addTurtle(turtle);

		Turtle[] turtles = new Turtle[50];

		for (int i = 0; i < turtles.length; i++) {
			turtles[i] = new Turtle();
			turtles[i].setX(new Random().nextInt(frame.getWidth()/2) + frame.getWidth()/2);
			turtles[i].setY(new Random().nextInt(frame.getHeight()*2/3) + frame.getHeight()/3);
			panel.addTurtle(turtles[i]);
		}
	}
}
