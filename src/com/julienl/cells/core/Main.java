package com.julienl.cells.core;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import com.julienl.cells.entity.Cells;
import com.julienl.cells.map.MapGenerator;
import com.julienl.cells.window.MapFrame;

public class Main {
	
	public static MapGenerator mg;
	public static boolean isRunning = false;
	
	public static ArrayList<Cells> cells = new ArrayList<Cells>();
	
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
		System.out.println("");
		System.out.println("Starting updating cells...");
	}

	public static void run() {
		isRunning = true;
		/*while(isRunning) {
			
		}*/
		Timer t = new Timer();
		t.schedule(new TimerTask() {

			@Override
			public void run() {
				Main.updateCells();
			}
			
		}, 2000, 1250);
	}

	public static void updateCells() {
		for(Cells c : cells) {
			c.loc.add(1, 0);
		}
	}

}
