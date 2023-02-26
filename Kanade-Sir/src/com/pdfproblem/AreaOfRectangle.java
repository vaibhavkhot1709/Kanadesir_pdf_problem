package com.pdfproblem;

import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[] args) {
		rectanglearea();
	}
	
	public static void rectanglearea() {
		Scanner in =new Scanner (System.in);
		
		System.out.println("Enter value of l,w");
		
		double w=in.nextDouble();
		double l= in.nextDouble();
		
		double area= l*w;
		System.out.println("area of rectangle is = "+area);
		
	}
}
