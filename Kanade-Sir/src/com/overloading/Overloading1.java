package com.overloading;

// implements square method using method overloading

public class Overloading1 {
	
	public static void main(String[] args) {
		Overloading1 o=new Overloading1();
		o.square();
		o.square(17);
		o.square(10.24);
	}
	
	public void square() {
		int x=7;
		int sqr=7*7;
		System.out.println("square of "  + 7 +" is : "+sqr);
	}
	
	public void square(int x) {
		int sqr=x*x;
		System.out.println("square of " + x+" is : "+sqr );
	}
	
	public void square(double j) {
		double sqr=j*j;
		System.out.println("square of " + j + " is : "+sqr);
	}
}
