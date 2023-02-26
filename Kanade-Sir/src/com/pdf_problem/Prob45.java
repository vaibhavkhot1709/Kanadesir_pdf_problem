package com.pdf_problem;
//45. Accept number and find maximum and minimum digit.//
import java.util.Scanner;
public class Prob45 {
	public static void main(String [] arg)
	{
		maxMinOfDigitd();
	}
	public static void maxMinOfDigitd()
	{
		Scanner in= new Scanner(System.in);
		System.out.println(" enter any  number");
		int n=in.nextInt();
		int m=n;
		int rem;
		int min=9;
		int max=0;
		while(n>0)
		{
			rem=n%10;
			if(rem<min)
			{
				min=rem;
			}
			else if(rem>max)
			{
				max=rem;
			}
			n=n/10;
		}
		System.out.println("min number is " +min);
			System.out.println("max number is " +max);
	}

}
