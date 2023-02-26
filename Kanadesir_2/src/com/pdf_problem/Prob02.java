package com.pdf_problem;

//2. Take input 3 values & calculate Multiplication.

import java.util.Scanner;

public class Prob02 {
	
	public static void main(String [] arg)
	{
		multiplication();
		
	}
	
	public static void multiplication()
	{
		int a,b,c,d;
		Scanner in= new Scanner(System.in);
		
		System.out.println(" Enter any 3 number!!!");
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		d=a*b*c;
		System.out.println(" multiplication is= " +d);
		
	}

}
