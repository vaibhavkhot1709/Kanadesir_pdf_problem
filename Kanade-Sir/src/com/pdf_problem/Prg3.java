package com.pdf_problem;

import java.util.Scanner;

// 2. Take input 3 values & calculate Multiplication.

public class Prg3 {
	public static void main(String arg []){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of i and j and k");
		int i=sc.nextInt();
		int j=sc.nextInt();
		int k=sc.nextInt();
		int c=i*j*k;
		System.out.println("Multiplication  of i*j*k is : "+c);

		}

}
