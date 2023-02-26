package com.pdfproblem;

import java.util.Scanner;

public class AreaOFCircle {

	public static void main(String[] args) {
		circleArea();	
	}

	private static void circleArea() {	
		Scanner input= new Scanner(System.in);
		
		System.out.println("enter value of r");
		
		double r= input.nextDouble();
		
		double area=3.14*r*r;
		
		System.out.println("area of circle is = " +area);
		
		double circumference= 2*3.14*r;
		
		System.out.println("Circumference of circle is = "+circumference);
	}
	
	
}
