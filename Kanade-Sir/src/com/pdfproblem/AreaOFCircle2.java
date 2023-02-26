package com.pdfproblem;


public class AreaOFCircle2 {

	public static void main(String[] args) {
		circleAreaByInitialization();	
	}

	private static void circleAreaByInitialization() {	
		double r=4;
		
		double area=3.14*r*r;
		
		System.out.println("area of circle is = " +area);
		
		double circumference= 2*3.14*r;
		
		System.out.println("Circumference of circle is = "+circumference);
	}
	
	
}
