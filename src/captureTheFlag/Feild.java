package captureTheFlag;

import info.gridworld.actor.*;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;

public class Feild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoundedGrid<Actor> g = new BoundedGrid<Actor>(50,100);
		ActorWorld field = new ActorWorld(g);
		field.add(new Location(0,0),new Runner(50,100));
		field.add(new Location(49,99),new Actor());
		for(int i = 0; i<150; i++) {
			field.add(new Rock());
		}
		field.show();
	}

}
