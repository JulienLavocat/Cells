package com.julienl.cells.core;

import com.julienl.cells.map.MapGenerator;
import com.julienl.cells.window.MapFrame;

public class Main {
	
	public static MapGenerator mg;
	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		long lastTime = System.currentTimeMillis();
		mg = new MapGenerator();
		mg.generate(50);
		mg.print();
		System.out.println("Generation time : " + (System.currentTimeMillis()-lastTime) + "ms");
		
		lastTime = System.currentTimeMillis();
		MapFrame frame = new MapFrame();
		frame.setVisible(true);
		
		System.out.println("Frame creation time : " + (System.currentTimeMillis()-lastTime) + "ms");
		System.out.println("Total generating time : " + (System.currentTimeMillis()-startTime) + "ms");
	}

}
