package com.julienl.cells.core;

import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import com.julienl.cells.entity.Cells;
import com.julienl.cells.map.MapGenerator;
import com.julienl.cells.window.MapFrame;

public class Main {
	
	public static MapGenerator mg;
	public static boolean isRunning = false;
	public static ArrayList<Cells> cells = new ArrayList<Cells>();
	
	private static CellsHandler cellsHandler;
	private static MapFrame frame;
	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		long lastTime = System.currentTimeMillis();
		long mapGenTime = 0l;
		long frameGenTime = 0l;
		long cellsGenTime = 0l;
		mg = new MapGenerator();
		mg.generate(50);
		mg.print();
		mapGenTime = (System.currentTimeMillis()-lastTime);
		
		lastTime = System.currentTimeMillis();
		frame = new MapFrame();
		frame.setVisible(true);
		frameGenTime = (System.currentTimeMillis()-lastTime);
		
		lastTime = System.currentTimeMillis();
		cellsHandler = new CellsHandler();
		cellsHandler.generateCells(mg.size);
		cellsGenTime = (System.currentTimeMillis()-lastTime);
		
		System.out.println("Map generation time : " + mapGenTime + "ms");
		System.out.println("Frame creation time : " + frameGenTime + "ms");
		System.out.println("Cells generation time : " + cellsGenTime + "ms");
		System.out.println("Total generating time : " + (System.currentTimeMillis()-startTime) + "ms");
		System.out.println("");
		System.out.println("Starting updating cells...");
		run();
	}

	public static void run() {
		Timer t = new Timer();
		t.schedule(new TimerTask() {

			@Override
			public void run() {
				Main.updateCells();
				Main.render();
			}
			
		}, 10, 250);
	}

	public static void updateCells() {
		frame.panel.clearGrid();
		Random r = new Random();
		for(Cells c : cells) {
			if(r.nextInt() % 2 == 0)
			c.loc.add(r.nextInt(2), r.nextInt(2));
		}
	}

	private static void render() {
		frame.panel.draw();
	}
	
}
