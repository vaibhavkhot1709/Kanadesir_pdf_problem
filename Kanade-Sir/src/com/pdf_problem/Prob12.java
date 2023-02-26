package com.pdf_problem;
//12. Swap 2(two) value’s without using third variable.
//a=a+b
//b=a-b
//a=a-b

import java.util.Scanner;

public class Prob12 {
	
	public static void main(String[] args) {
		
		swap() ;
	}
	
	public static void swap() {
		int a,b;
		Scanner in= new Scanner(System.in);
		System.out.println("enetr value of a and b");
		a=in.nextInt();
		b=in.nextInt();
		
		a=a+b;
		b=a-b;
		System.out.println(" value of b after swap is "+b);
		
		a=a-b;
		System.out.println(" value of a after swap is "+a);

	}

}
