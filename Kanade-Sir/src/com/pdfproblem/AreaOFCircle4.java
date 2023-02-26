package com.pdfproblem;


public class AreaOFCircle4 {

	public static void main(String[] args) {
		AreaOFCircle4 in= new AreaOFCircle4();
		in.circleAreaByInitialization();	
	}

	private final double circleAreaByInitialization() {	
		double r=4;
		
		double area=3.14*r*r;
		
		System.out.println("area of circle is = " +area);
		
		double circumference= 2*3.14*r;
		
		System.out.println("Circumference of circle is = "+circumference);
		
		return area;
	}
	
	
}
