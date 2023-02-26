package com.overloading;

// implements concept of methods overloading in case of calculating area of different shape
// shape( triangle , rectangle, circle)

public class Overloading2 {
	public static void main(String[] args) {
		area(7);
		area(8,9);
		area(12,6);
	}
	
	public static void area(int r) {
		double arc=3.14*r*r;
		System.out.println("area of circle of radius "+r + " is "+arc);
	}
	
	public static void area(int b, int l) {
		int arr=b*l;
		System.out.println("area of rectangle of  width "+b+  " and length" +l + " is "+arr);
	}

	
	public static void area(int b, double h) {
		double art=0.5*b*h;
		System.out.println("area of traingle  of base "+b + " and height "+h + " is "+art);
	}


}
