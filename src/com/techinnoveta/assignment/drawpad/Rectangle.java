package com.techinnoveta.assignment.drawpad;

import java.util.HashMap;
import java.util.Map;

public class Rectangle implements Shape {
	private Map<XYCodilation, String> map = new HashMap<XYCodilation, String>();

	private int canvasHeight;

	private int canvasWidth;

	public Rectangle(int canvasWidth, int canvasHeight) {
		super();
		this.canvasHeight = canvasHeight;
		this.canvasWidth = canvasWidth;
	}

	@Override
	public void drawCodilation(String line) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
		String[] lineArr = line.split(" ");

		int x1 = Integer.parseInt(lineArr[1]);
		int y1 = Integer.parseInt(lineArr[2]);
		int x2 = Integer.parseInt(lineArr[3]);
		int y2 = Integer.parseInt(lineArr[4]);
		if (x1 < x2 && y1 < y2) {
			for (int i = 1; i <= canvasHeight; i++) {
				if (i >= y1 && i <= y2) {
					for (int j = 1; j <= canvasWidth; j++) {
						if (j >= x1 && j <= x2) {
							if (j == x1 || j == x2) {
								XYCodilation xyCodilation = new XYCodilation(j, i);
								map.put(xyCodilation, "x");
							} else if (i == y1 || i == y2) {
								XYCodilation xyCodilation = new XYCodilation(j, i);
								map.put(xyCodilation, "x");
							}
						}

					}
				}
			}
		} else {
			System.out.println("Invalid argument");
		}

	}

	public Map<XYCodilation, String> getMap() {
		return map;
	}

}
