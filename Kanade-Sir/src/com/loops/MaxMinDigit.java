package com.loops;

import java.util.Scanner;

public class MaxMinDigit {
	public static void main(String[] args) {
		maxMinNumberOfDigit();
	}
	
	
	public static void maxMinNumberOfDigit() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("entre any number");
		
		int a=in.nextInt();
		int rem;
		int res=0;
		int max=a%10;
		int min=a%10;
		for(int i=0;i<=a;i++)
		{
			rem=a%10;
			
			if(rem<min)
			min=rem;
			else if(rem>max)
				max=rem;
			a=a/10;
			
		}
		System.out.println("max value is "+max);
		System.out.println("min value is "+min);
	}

}
