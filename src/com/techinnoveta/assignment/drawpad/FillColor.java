package com.techinnoveta.assignment.drawpad;

import java.util.HashMap;
import java.util.Map;

public class FillColor {
	private Map<XYCodilation, String> map = new HashMap<XYCodilation, String>();

	private int canvasHeight;

	private int canvasWidth;

	public FillColor(int canvasWidth, int canvasHeight) {
		this.canvasWidth = canvasWidth;
		this.canvasHeight = canvasHeight;
	}

	public void fillColorCodilation(String input, Map<XYCodilation, String> codilationMap) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
		String[] lineArr = input.split(" ");
		map = codilationMap;
		neighbor(Integer.parseInt(lineArr[1]), Integer.parseInt(lineArr[2]), lineArr[3]);
	}

	public void neighbor(int x, int y, String color) {
		if (x >= 0 && x < canvasWidth + 1 && y >= 0 && y <= canvasHeight + 1) {
			XYCodilation drawSympol = new XYCodilation(x, y);
			if (map.get(drawSympol).equals(" ")) {
				map.put(drawSympol, color);
				neighbor(x - 1, y - 1, color);
				neighbor(x + 1, y + 1, color);
				neighbor(x - 1, y + 1, color);
				neighbor(x + 1, y - 1, color);
				neighbor(x, y + 1, color);
				neighbor(x, y - 1, color);
				neighbor(x - 1, y, color);
				neighbor(x + 1, y, color);
			}
		}

	}

	public Map<XYCodilation, String> getMap() {
		return map;
	}
}