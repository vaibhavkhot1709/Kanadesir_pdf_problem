package com.pdfproblem;

//calculate addition by using Scanner//

import java.util.Scanner;

public class Addition {

	public static void main(String [] arg) {
		additionByScanner();
		
	}

	private static void additionByScanner() {
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter value of a and b !!!");
		
		int a=input.nextInt();
		int b= input.nextInt();
		int c= a+b;
		System.out.println(" addition is= " +c);
	}
}


