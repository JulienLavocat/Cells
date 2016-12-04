package com.julienl.cells.core;

import java.util.Random;

import com.julienl.cells.entity.Cells;

public class CellsHandler {
	
	public void generateCells(int mapSize) {
		Random r = new Random();
		int cellsNb;
		do {
			cellsNb = r.nextInt(mapSize);
		} while (cellsNb == 0);
		cellsNb = 1;
		System.out.println("Generating "+cellsNb+" cells...");
		
		for(int i = 0; i < cellsNb; i++) {
			Main.cells.add(new Cells());
		}
		
		System.out.println("Cells generated.");
	}

}
