package com.pdfproblem;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		
		System.out.println("Enter three value");
		
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		
		int d= a*b*c;
		System.out.println("result of multiplication is = "+d);
		
	}

}
