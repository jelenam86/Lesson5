package exercises;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

/* 
 * Use the Gridworld Reference document in the "doc" directory to complete the following tasks;
 * 
 * 1. Figure out how to get the World to show.
 * 2. Figure out how to add a Bug to the world (clue: you will need the Bug and Location objects)
 * 3. Add another bug at a random location in the world.
 * 4. Change the color of that bug to blue.
 * 5. Make the bug face to the right.
 * 6. Add flowers to the left and right of the bug.
 * 7. Fill the whole world with flowers!
*/

public class Gridworld {

	public static void main(String[] args) {

		World<Actor> earth = new World<Actor>();
		earth.show();

		int x = earth.getGrid().getNumRows();
		int y = earth.getGrid().getNumCols();
		int n = new Random().nextInt(x) + 1;
		int m = new Random().nextInt(y) + 1;

		Location LA = new Location(x - n, y - m);
		Bug bug = new Bug(Color.BLUE);
		earth.add(LA, bug);

		Location randLoc = earth.getRandomEmptyLocation();

		Bug bugs = new Bug();
		earth.add(randLoc, bugs);

		bugs.setColor(Color.BLUE);

		bugs.turn();
		bugs.turn();

		Flower flo = new Flower(Color.MAGENTA);
		if (randLoc.getCol() - 1 >= 0) {
			Location left = new Location(randLoc.getRow(), randLoc.getCol() - 1);
			earth.add(left, flo);
		}
		if (randLoc.getCol() + 1 < y) {
			Location right = new Location(randLoc.getRow(), randLoc.getCol() + 1);
			earth.add(right, flo);
		}

		int field = x * y - earth.getGrid().getOccupiedLocations().size();
		Flower flowers = new Flower();
		while (field > 0) {
			earth.add(earth.getRandomEmptyLocation(), flowers);
			field--;
		}

	}
}
