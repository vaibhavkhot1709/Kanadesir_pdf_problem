package com.pdf_problem;

import java.util.Scanner;

//11. Accept 2 Different value’s
//Write a program to Swap these value’s (interchange) & then Display on the Screen.
public class Prob11 {
	public static void main(String[] args) {
		swap();
	}
	
	public static void swap() {
		int a,b,c;
		Scanner in= new Scanner(System.in);
		System.out.println("enetr value of a and b");
		a=in.nextInt();
		b=in.nextInt();
		
		c=a+b;
		
		a=c-a;
		System.out.println(" value of a after swap is "+a);

		b=c-
				a;
		System.out.println(" value of b after swap is "+b);
	}

}
