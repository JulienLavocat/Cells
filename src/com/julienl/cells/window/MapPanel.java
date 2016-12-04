package com.julienl.cells.window;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import com.julienl.cells.core.Main;
import com.julienl.cells.entity.Cells;
import com.julienl.cells.map.Location;

public class MapPanel extends Container {

	private static final long serialVersionUID = -5648761565028770978L;
	
	public MapPanel() {
	}

	@Override
	public void paint(Graphics g) {
		//int size = MapFrame.size;
        for (int i = 10; i <= 510; i+= 10)
            g.drawLine (i, 10, i, 510);

        for (int i = 10; i <= 510; i+= 10)
            g.drawLine (10, i, 510, i);
        
        for(Location l : Main.mg.map.water) {
        	int cellX = 10 + (l.x * 10);
        	int cellY = 10 + (l.y * 10);
        	g.setColor(Color.BLUE);
        	g.fillRect(cellX, cellY, 10, 10);
        }
        
        for(Location l : Main.mg.map.food) {
         	int cellX = 10 + (l.x * 10);
        	int cellY = 10 + (l.y * 10);
        	g.setColor(Color.RED);
        	g.fillRect(cellX, cellY, 10, 10);
        }
        
		super.paint(g);
	}
	
	public void draw() {
		Graphics g = this.getGraphics();
		for(Cells c : Main.cells) {
			g.setColor(Color.DARK_GRAY);
			g.fillRect(10 + c.loc.x*10, 10+c.loc.y*10, 10, 10);
		}
	}

	public void clearGrid() {
		Graphics g = this.getGraphics();
		for(Cells c : Main.cells) {
			g.setColor(this.getBackground());
			g.fillRect(10 + c.loc.x*10, 10+c.loc.y*10, 10, 10);
		}
		
		g.setColor(Color.BLACK);
        for (int i = 10; i <= 510; i+= 10)
            g.drawLine (i, 10, i, 510);

        for (int i = 10; i <= 510; i+= 10)
            g.drawLine (10, i, 510, i);
	}
	
}
