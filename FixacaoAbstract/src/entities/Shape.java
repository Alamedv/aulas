package entities;

import entities.enums.Color;

public abstract class Shape {

	public Shape() {
		super();
	}

	public Shape(Color color) {
		super();
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	private Color color;

	
	public abstract double area();
}
