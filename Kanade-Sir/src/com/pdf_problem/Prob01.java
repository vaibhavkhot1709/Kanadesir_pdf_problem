package com.pdf_problem;

import java.util.Scanner;

//1. Take input 2 values & calculate Addition.

public class Prob01 {
	
	public static void main(String[] args) {
		addition();
	}
	
	public static void addition() {
		Scanner in =new Scanner(System.in);
		System.out.println("enter two number !!!");
		int num=in.nextInt();
		int num2=in.nextInt();
		
		int res=num+num2;
		
		System.out.println(" addition is "+res);
		
	}

}
