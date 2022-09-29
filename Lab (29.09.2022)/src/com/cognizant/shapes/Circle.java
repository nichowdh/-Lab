package com.cognizant.shapes;

public class Circle {
	float radius;

	public Circle() { // constructor 1
		radius = 1.5f; // initializing the variables
	}

	Circle(float radius) { // constructor 2
		this.radius = radius;
	}

	float pi = 3.5f; // initializing the variable

	Circle(float radius, float pi) { // constructor 3
		this.radius = radius; // defaulting the pi value
	}

	float calculateCircleArea(float r) {
		return pi * r * r;
	}

	float calculateCircumference(float r) {
		return 2 * pi * r;
	}

// main method
	public static void main(String[] args) {
		Circle c = new Circle();
		c.calculateCircleArea(1.5f);
		c.calculateCircumference(3.5f);
	}

}
