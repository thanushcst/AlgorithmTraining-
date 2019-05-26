package com.techinnoveta.practice.loosecoupled;

public class Product implements JSONWriter{
	private String productCode;
	private Size size;
	private Color color;
	private String price;

	public Product(String productCode, Size size, Color color, String price) {
		this.productCode = productCode;
		this.size = size;
		this.color = color;
		this.price = price;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String write(Object object) {
		 return "[code:" + this.productCode + ", size:" + this.size.getSize() + ", " +
		            "color:" + this.getColor().getColor() + " price:" + this.getPrice() + "]";
	}

}
