package com.cognizant.shapes;

// Assesment 1
public class Circle {
	float radius;

	public Circle() { // constructor 1
		radius = 1.5f; // initializing the variables
	}

	public Circle(float radius) { // constructor 2
		this.radius = radius;
	}

	float pi; // initializing the variable

	public Circle(float radius, float pi) { // constructor 3
		this.radius = radius; // defaulting the pi value
		this.pi=3.5f;
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
		new Circle().calculateCircleArea(1.5f);
		new Circle().calculateCircumference(3.5f);
	}

}
