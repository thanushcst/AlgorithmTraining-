package com.techinnoveta.assignment.drawpad;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DrawingMain {
	DrawingCanvas canvas;
	FillColor fillColor;
	
	Rectangle rectangle;
	Line line;
	
	private Map<XYCodilation, String> map = new HashMap<XYCodilation, String>();
	int canvasHeight;
	int canvasWidth;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DrawingMain drawing = new DrawingMain();
		System.out.print("Enter command : ");
		while (s.hasNext()) {
			String line = s.nextLine();
			if (!line.toUpperCase().equals("Q")) {
				try {
					drawing.draw(line);
				} catch (IllegalArgumentException e) {
					System.out.println("\nInvalid Input\n");
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("\nInvalid Argument\n");
				}
			} else {
				System.exit(0);
			}

			System.out.print("\nEnter command : ");
		}
		s.close();
	}

	public void draw(String input) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
		String[] lineArr = input.split(" ");
		String action = lineArr[0];

		if (action.toUpperCase().equals("C")) {
			canvasWidth = Integer.parseInt(lineArr[1]);
			canvasHeight = Integer.parseInt(lineArr[2]);
			canvas = new DrawingCanvas(canvasWidth, canvasHeight);
			canvas.drawMainCanvas();
			map.putAll(canvas.getMap());
		} else if (action.toUpperCase().equals("L")) {
			checkCanvas();
			line = new Line(canvasWidth, canvasHeight);
			line.drawCodilation(input);
			map.putAll(line.getMap());
		} else if (action.toUpperCase().equals("R")) {
			checkCanvas();
			rectangle = new Rectangle(canvasWidth, canvasHeight);
			rectangle.drawCodilation(input);
			map.putAll(rectangle.getMap());
		} else if (action.toUpperCase().equals("B")) {
			checkCanvas();
			fillColor = new FillColor(canvasWidth, canvasHeight);
			fillColor.fillColorCodilation(input, map);
			map.putAll(fillColor.getMap());
		}

		for (int i = 0; i <= canvasHeight + 1; i++) {
			for (int j = 0; j <= canvasWidth + 1; j++) {
				XYCodilation drawSympol = new XYCodilation(j, i);
				if (map.get(drawSympol) != null) {
					System.out.print(map.get(drawSympol));
				}
			}
			System.out.println("");
		}
	}

	public void checkCanvas() {
		if (canvasHeight <= 0 || canvasWidth <= 0) {
			System.out.print("Enter canvas details first eg(C x y)");
		}
	}

}