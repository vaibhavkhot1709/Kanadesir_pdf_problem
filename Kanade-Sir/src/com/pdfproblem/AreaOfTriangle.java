package com.pdfproblem;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		triangle();
	}
	
	public static void triangle() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter value of b, h");
		
		int b=in.nextInt();
		double h=in.nextInt();
		
		double area= 1.5*b*h;
		
		System.out.println("area of traingle = "+area);
		
	}
}
