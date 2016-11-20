package com.julienl.cells.map;

import java.util.ArrayList;

public class Map {

	public ArrayList<Location> water;
	public ArrayList<Location> food;
	public String[][] matrix;
	
	public Map() {
		this(100);
	}
	
	public Map(int size) {
		matrix = new String[size][size];
		for (int i = 0; i < matrix.length; i++)
		    for (int j = 0; j < matrix[i].length; j++)
		        matrix[i][j] = "-";
		water = new ArrayList<Location>();
		food = new ArrayList<Location>();
	}
	
	public void addWater(Location loc) {
		water.add(loc);
		matrix[loc.y][loc.x] = "*";
	}
	
	public void addFood(Location loc) {
		food.add(loc);
		matrix[loc.y][loc.x] = "$";
	}
	
	public void print() {
		for (int i = 0; i < matrix.length; i++) {
		    for (int j = 0; j < matrix[i].length; j++) {
		        System.out.print(matrix[i][j] + " ");
		    }
		    System.out.println();
		}
	}
	
}
