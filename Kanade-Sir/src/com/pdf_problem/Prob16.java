package com.pdf_problem;
//16. Take input 2 different number’s & display Greater & Smaller Number.

import java.util.Scanner;

public class Prob16 {
	public static void main(String [] arg)
	{
		smallerGreater();
	}
	
	public static void smallerGreater()
	{
		Scanner in= new Scanner(System.in);
		System.out.println(" Enter two numbers");
		int a=in.nextInt();
		int b=in.nextInt();
		
		if(a>b)
		System.out.println(" b is a greater number " +b);
		else
			System.out.println(" a is a greater number " +a);
	}
}
