package com.pdf_problem;

import java.util.Scanner;

//7. Accept Base & Height of 90o Triangle & calculate Area. (A=1/2*B*H)

public class Prob07 {

	public static void main(String arg [])
	{
		triangleArea();
	}
	
	public static void triangleArea()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter value of triangles");
		
		double b= in.nextDouble();
		double h= in.nextDouble();
		
		double area= 0.5* b* h;
		
		System.out.println("Areaa of triangles= " + area);
	}

}
