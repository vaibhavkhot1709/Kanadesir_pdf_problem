package com.pdf_problem;

import java.util.Scanner;

//52. Accept two numbers and display Fibonacci series
public class Prob52 {
	
	public static void main(String[] args) {
		fibonacci();
	}
	
	public static void fibonacci() {
		int x,y,c;
		Scanner in=new Scanner(System.in);
		System.out.println(" enter alue of x and y ");
		
		x=in.nextInt();
		y=in.nextInt();
		
		for(int i=1;i<=y;i++) {
			c=x+y;
			System.out.println(c);
			x=y;
			y=c;
		}
	}

}

