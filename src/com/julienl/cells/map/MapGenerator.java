package com.julienl.cells.map;

import java.util.Random;

public class MapGenerator {
	
	public int foodSources = 0;
	public int waterSources = 0;
	public Map map;
	public int size;
	
	public void generate(int size) {
		System.out.println("Generating map...");
		
		this.size = size;
		
		Random r = new Random();
		map = new Map(size);
		
		System.out.println("Generating food & water source...");
		
		foodSources = r.nextInt(20);
		waterSources = r.nextInt(15);

		for(int f = 0; f < foodSources; f++) {
			map.addFood(new Location(r.nextInt(size), r.nextInt(size)));
		}
		foodSources = map.food.size();
		
		for(int w = 0; w < waterSources; w++) {
			map.addWater(new Location(r.nextInt(size), r.nextInt(size)));
		}
		waterSources = map.water.size();
		
		System.out.println("Performing checking and correcting map errors...");
		
		//checkMap();
		
		System.out.println("Map generated.");
		System.out.println();
	}
	
	public void print() {
		System.out.println("Map is generated with following properties : ");
		System.out.println("Food sources ($) : " + foodSources);
		System.out.println("Water sources (*) : " + waterSources);
		System.out.println();
	}
	
	public void checkMap() {
		//FURTHER PURPOSES
	}

}
