package com.techinnoveta.assignment.drawpad;

import java.util.HashMap;
import java.util.Map;

public class Canvas {
	private Map<XYCodilation, String> map = new HashMap<XYCodilation, String>();

	private int canvasHeight;

	private int canvasWidth;

	public Canvas(int canvasWidth, int canvasHeight) {
		this.canvasWidth = canvasWidth;
		this.canvasHeight = canvasHeight;
	}

	public void drawMainCanvas() throws ArrayIndexOutOfBoundsException, IllegalArgumentException{
		for (int i = 0; i <= canvasHeight + 1; i++) {
			for (int j = 0; j <= canvasWidth + 1; j++) {
				if (i == 0 || i == canvasHeight + 1) {
					XYCodilation xyCodilation = new XYCodilation(j, i);
					map.put(xyCodilation, "-");
				} else {
					if (j == 0 || j == canvasWidth + 1) {
						XYCodilation xyCodilation = new XYCodilation(j, i);
						map.put(xyCodilation, "|");
					} else {
						XYCodilation xyCodilation = new XYCodilation(j, i);
						map.put(xyCodilation, " ");
					}
				}
			}
		}
	}

	public Map<XYCodilation, String> getMap() {
		return map;
	}
}