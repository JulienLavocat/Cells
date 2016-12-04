package com.julienl.cells.map;

public class Location {

	public int x;
	public int y;
	
	public Location() {
		this(0, 0);
	}
	
	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void add(int x, int y) {
		this.x+=x;
		this.y+=y;
	}
	
	@Override
	public String toString() {
		return "x:"+x+" y:"+y;
	}
	
}
