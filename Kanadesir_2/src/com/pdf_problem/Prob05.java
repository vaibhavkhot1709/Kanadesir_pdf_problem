package com.pdf_problem;

import java.util.Scanner;

//5. Take input Radius of Circle & calculate Area & Circumference.

public class Prob05 {
	public static void area()      //here pi=3.14//
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Entre value=");
		
		double r= sc.nextDouble();
		double ac;
		 ac=3.14*r*r;
		
		System.out.println("Area of circle= "+ac);
	}
	public static void main(String arg [])
	{
		
		area();
		
	}

}
