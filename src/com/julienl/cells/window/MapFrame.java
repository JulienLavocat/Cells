package com.julienl.cells.window;

import java.awt.Color;

import javax.swing.JFrame;

import com.julienl.cells.core.Main;

public class MapFrame extends JFrame {

	private static final long serialVersionUID = 5084819281047493364L;
	public static int size;
	public MapPanel panel;
	
	public MapFrame() {
		this.setTitle("Cells");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		//this.setSize(d.width / 2, d.height / 2);
		//this.setResizable(false);
		size = (Main.mg.map.matrix.length * 10);
		this.setSize(size+38, size + 60);
		this.setLocationRelativeTo(null);
		panel = new MapPanel();
		this.setContentPane(panel);
	}
}
