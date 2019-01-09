package com.techinnoveta.assignment.credit;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Drawing {
	Map<DrawSympol, String> drawMap = new HashMap<DrawSympol, String>();
	int canvasHeight = 0;
	int canvasWidth = 0;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Drawing drawing = new Drawing();
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

	public void setCanvas(int width, int height) {
		canvasHeight = height;
		canvasWidth = width;
		for (int i = 0; i <= height + 1; i++) {
			for (int j = 0; j <= width + 1; j++) {
				if (i == 0 || i == height + 1) {
					DrawSympol drawSympol = new DrawSympol(j, i);
					drawMap.put(drawSympol, "-");
				} else {
					if (j == 0 || j == width + 1) {
						DrawSympol drawSympol = new DrawSympol(j, i);
						drawMap.put(drawSympol, "|");
					} else {
						DrawSympol drawSympol = new DrawSympol(j, i);
						drawMap.put(drawSympol, " ");
					}
				}
			}
		}
	}

	public void setLine(int x1, int y1, int x2, int y2) {
		checkCanvas();
		for (int i = 1; i <= canvasHeight; i++) {
			for (int j = 1; j <= canvasWidth; j++) {
				if ((i >= y1 && j >= x1) && (i <= y2 && j <= x2)) {
					DrawSympol drawSympol = new DrawSympol(j, i);
					drawMap.put(drawSympol, "x");
				}
			}
		}
	}

	public void setRectangle(int x1, int y1, int x2, int y2) {
		checkCanvas();
		for (int i = 1; i <= canvasHeight; i++) {
			if (i >= y1 && i <= y2) {
				for (int j = 1; j <= canvasWidth; j++) {
					if (j >= x1 && j <= x2) {
						if (j == x1 || j == x2) {
							DrawSympol drawSympol = new DrawSympol(j, i);
							drawMap.put(drawSympol, "x");
						} else if (i == y1 || i == y2) {
							DrawSympol drawSympol = new DrawSympol(j, i);
							drawMap.put(drawSympol, "x");
						}
					}

				}
			}
		}
	}

	public void setColor(int x, int y, String color) {
		checkCanvas();
		neighbor(x, y, color);
	}

	public void neighbor(int x, int y, String color) {
		if (x >= 0 && x < canvasWidth + 1 && y >= 0 && y <= canvasHeight + 1) {
			DrawSympol drawSympol = new DrawSympol(x, y);
			if (drawMap.get(drawSympol).equals(" ")) {
				drawMap.put(drawSympol, color);
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

	public void draw(String line) throws IllegalArgumentException, ArrayIndexOutOfBoundsException {
		String[] lineArr = line.split(" ");
		String action = lineArr[0];

		if (action.toUpperCase().equals("C")) {
			setCanvas(Integer.parseInt(lineArr[1]), Integer.parseInt(lineArr[2]));
		} else if (action.toUpperCase().equals("L")) {
			setLine(Integer.parseInt(lineArr[1]), Integer.parseInt(lineArr[2]), Integer.parseInt(lineArr[3]),
					Integer.parseInt(lineArr[4]));
		} else if (action.toUpperCase().equals("R")) {
			setRectangle(Integer.parseInt(lineArr[1]), Integer.parseInt(lineArr[2]), Integer.parseInt(lineArr[3]),
					Integer.parseInt(lineArr[4]));
		} else if (action.toUpperCase().equals("B")) {
			setColor(Integer.parseInt(lineArr[1]), Integer.parseInt(lineArr[2]), lineArr[3]);
		}

		for (int i = 0; i <= canvasHeight + 1; i++) {
			for (int j = 0; j <= canvasWidth + 1; j++) {
				DrawSympol drawSympol = new DrawSympol(j, i);
				if (drawMap.get(drawSympol) != null) {
					System.out.print(drawMap.get(drawSympol));
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

class DrawSympol {
	private int x;
	private int y;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + ((String.valueOf(y) == null) ? 0 : String.valueOf(y).hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DrawSympol other = (DrawSympol) obj;
		if (x != other.x)
			return false;
		if (String.valueOf(y) == null) {
			if (String.valueOf(other.y) != null)
				return false;
		} else if (!String.valueOf(y).equals(String.valueOf(other.y)))
			return false;
		return true;
	}

	public DrawSympol(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}