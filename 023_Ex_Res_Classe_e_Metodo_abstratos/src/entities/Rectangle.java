package entities;

import entities.enums.Color;

public class Rectangle extends Shape {

	private double width;
	private double hight;

	public Rectangle() {
		super();
	}


	public Rectangle(Color color, double width, double high) {
		super(color);
		this.width = width;
		this.hight = high;
	}


	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHigh() {
		return hight;
	}

	public void setHigh(double high) {
		this.hight = high;
	}

	@Override
	public double area() {
		return width * hight;
	}
}
