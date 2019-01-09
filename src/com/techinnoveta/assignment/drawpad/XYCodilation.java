package com.techinnoveta.assignment.drawpad;

public class XYCodilation {
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
		XYCodilation other = (XYCodilation) obj;
		if (x != other.x)
			return false;
		if (String.valueOf(y) == null) {
			if (String.valueOf(other.y) != null)
				return false;
		} else if (!String.valueOf(y).equals(String.valueOf(other.y)))
			return false;
		return true;
	}

	public XYCodilation(int x, int y) {
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
