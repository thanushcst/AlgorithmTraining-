package com.techinnoveta.assignment.drawpad;

import java.util.HashMap;
import java.util.Map;

public class Line implements Shape {
	private Map<XYCodilation, String> map = new HashMap<XYCodilation, String>();

	private int canvasHeight;

	private int canvasWidth;

	public Line(int canvasWidth, int canvasHeight) {
		super();
		this.canvasHeight = canvasHeight;
		this.canvasWidth = canvasWidth;
	}
	
	@Override
	public void drawCodilation(String line) throws ArrayIndexOutOfBoundsException, IllegalArgumentException{
		String[] lineArr = line.split(" ");
		int tempX, tempY = 0;
		int x1 = Integer.parseInt(lineArr[1]);
		int y1 = Integer.parseInt(lineArr[2]);
		int x2 = Integer.parseInt(lineArr[3]);
		int y2 = Integer.parseInt(lineArr[4]);
		
		if(x1 == x2 && y2 < y1) {
			tempX = x1;
			x1 = x2;
			x2 = tempX;
			
			tempY = y1;
			y1 = y2;
			y2 = tempY;
			
		} else if(y1 == y2 && x2 < x1) {
			tempY = y1;
			y1 = y2;
			y2 = tempY;
			
			tempX = x1;
			x1 = x2;
			x2 = tempX;	
		}
		
		if(x1 == x2 || y1 == y2) {
			for (int i = 1; i <= canvasHeight; i++) {
				for (int j = 1; j <= canvasWidth; j++) {
					if ((i >= y1 && j >= x1) && (i <= y2 && j <= x2)) {
						XYCodilation xyCodilation = new XYCodilation(j, i);
						map.put(xyCodilation, "x");
					}
				}
			}
		} else {
			System.out.println("Argument not support!");
		}
		
	}
	
	public Map<XYCodilation, String> getMap() {
		return map;
	}

}
