package com.pdf_problem;

import java.util.Scanner;

//6. Accept 2 sides of Rectangle & calculate Area. (A=S1*S2)

public class Prob06 {
	public static void main (String arg [])
	{
		ar();
	}
	
	public static void ar()
	{
		Scanner input=new Scanner(System.in);
		System.out.println(" enter value of s1 and s2");
		
		int s1=input.nextInt();
		int s2= input.nextInt();
		
		int artc= s1 * s2;
		
		System.out.println(" area of rectangle =  " +artc);
	}
}
