package examples;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Duck {

	private String favoriteFood;
	private int lifeExpectancy;
	private static int numberOfCreations = 0;
	private String color;

	{
		Duck.numberOfCreations++;
	}
	
	public Duck() {
		if (Duck.numberOfCreations % 2 == 1)
			this.color = "black";
		else
			this.color = "white";
	}

	public Duck(String favoriteFood, int lifeExpectancy) {
		this.favoriteFood = favoriteFood;
		this.lifeExpectancy = lifeExpectancy;
	}

	public void waddle() {
		lifeExpectancy++;
		System.out.println("waddle waddle");
	}

	@Override
	public String toString() {
		return "This duck likes to eat " + this.favoriteFood + " and will live to be " + this.lifeExpectancy + ".";
	}

	public void quack() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("sounds/quack.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static int getNumberOfCreations() {
		return Duck.numberOfCreations;
	}

	public String getColor() {
		return this.color;
	}

	/**
	 * Only purpose is to properly run testWeCanCountTheNumberOfDucksCreated() in
	 * StaticDucks class. So with this method we will set numberOfCreations to
	 * number before entering the test.
	 * 
	 * @param a
	 */
	public static void setNumberOfCreations(int a) {
		Duck.numberOfCreations = a;
	}

}
