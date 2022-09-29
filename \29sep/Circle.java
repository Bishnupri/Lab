package com.cognizant.shapes.java;

public class Circle {
	private float radius;
	static float pi=3.5f;
	public Circle() {
		radius=1.5f;
	}
	Circle(float radius){
		this.radius=radius;
	}
	Circle(float radius,float pi){
		this.radius=radius;
	}
	float calculateCircleArea(float r) {
		return pi*r*r;
	}
	float calculateCirumference(float r) {
		return 2*pi*r;
	}
	public static void main(String[]args) {
		System.out.println(new Circle().calculateCircleArea(2.5f));
		System.out.println(new Circle().calculateCirumference(2.0f));
	}

}
