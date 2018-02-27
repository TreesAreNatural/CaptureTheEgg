package captureTheFlag;

import java.util.ArrayList;

import info.gridworld.actor.*;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class Runner extends Bug {
	private int[][] map;
	private int x;
	private int y;
	private boolean step;
	
	public Runner(int w, int h) {
		x = 0;
		y = 0;
		map = new int[h][w];
		step = false;
	}
	
	public void act() {
		if(step==false) {
			Grid<Actor> g = getGrid();
			ArrayList<Location> taken = g.getOccupiedLocations();
			for(int i = 0; i<taken.size(); i++) {
				Location l = taken.get(i);
				map[l.getCol()][l.getRow()] = -1;
			}
			for(int i = 0; i<map.length; i++) {
				for(int j = 0; j<map[i].length; j++) {
					System.out.print(map[i][j]);
				}
				System.out.println();
			}
		}
	}
}
