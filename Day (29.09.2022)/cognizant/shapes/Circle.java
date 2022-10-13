package com.cognizant.shapes;

// Assesment 1
public class Circle {
	float radius;
	float pi = 3.5f;

	public Circle() { // constructor 1
		radius = 1.5f; // initializing the variables
	}

	public Circle(float radius) { // constructor 2
		this.radius = radius;
	}

	public Circle(float radius, float pi) { // constructor 3
		this.radius = radius; // defaulting the pi value
		this.pi = 3.5f;
	}

	public float calculateCircleArea(float radius) {
		return pi * radius * radius;
	}

	public float calculateCircumference(float radius) {
		return 2 * pi * radius;
	}

// main method
	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println(c1.calculateCircleArea(2.5f));
		System.out.println(c1.calculateCircumference(3.5f));
	}

}
