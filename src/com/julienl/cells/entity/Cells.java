package com.julienl.cells.entity;

import java.awt.Color;
import java.util.Random;

import com.julienl.cells.core.Main;
import com.julienl.cells.map.Location;

public class Cells {
	
	public int health;
	public int food;
	public int water;
	public Location loc;
	public Color color;
	
	public Cells() {
		this(10, 10, 10);
	}
	
	public Cells(int health, int food, int water) {
		this.health = health;
		this.food = food;
		this.water = water;
		Random r = new Random();
		this.loc = new Location(r.nextInt(Main.mg.size), r.nextInt(Main.mg.size));
		this.color = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
	}

}
