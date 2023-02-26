package com.loops;

/*54. Accept number and find is it exact number or not.
28 = 1 + 2 + 4 + 7 + 14 = 28
(These are factors of 28)*/

import java.util.Scanner;

public class ExactMAtch {
	public static void main(String[] args) {
		match();
	}
	
	public static void match() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter any number");
		int  num =in.nextInt();
		int fact=0;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				fact=fact+i;
				System.out.println(i);
			}
		}
		System.out.println("addition ="+fact);
		if(num==fact)
			System.out.println("is a Exact number");
	}
}
