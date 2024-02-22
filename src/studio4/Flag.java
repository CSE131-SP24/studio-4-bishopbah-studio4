package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
	StdDraw.setPenColor(200, 236, 250);
	StdDraw.filledRectangle(0.5, 0.5, 0.45, 0.3);
	// draw flag base
	
	StdDraw.setPenColor(247, 241, 146);
	StdDraw.filledCircle(0.5, 0.5, 0.15);
	StdDraw.setPenRadius(0.01);
	StdDraw.line(0.5, 0.675, 0.5, 0.775);
	StdDraw.line(0.5, 0.325, 0.5, 0.235);
	StdDraw.setPenColor(23,92,41);
	StdDraw.text(0.2, 0.5, "B");
	StdDraw.text(0.5, 0.5, "B");
	StdDraw.text(0.8, 0.5, "L");
	
	}
}