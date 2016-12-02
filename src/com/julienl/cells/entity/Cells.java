package com.julienl.cells.entity;

import java.awt.Color;

import com.julienl.cells.map.Location;

public class Cells {
	
	public int health;
	public int food;
	public int water;
	public Location loc;
	public Color color;
	
	public Cells() {
		this(0, 0, 0);
	}
	
	public Cells(int health, int food, int water) {
		this.health = health;
		this.food = food;
		this.water = water;
	}

}
