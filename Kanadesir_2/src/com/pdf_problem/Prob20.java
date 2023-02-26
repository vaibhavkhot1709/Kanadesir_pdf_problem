package com.pdf_problem;

import java.util.Scanner;

//20. Accept any number & display it is Odd or Even.
public class Prob20 {
	public static void main(String[] args) {
		oddEvenNumber();
	}

	public static void oddEvenNumber() {
		Scanner in = new Scanner(System.in);
		System.out.println(" enter any number");
		int num=in.nextInt();
		
		if(num % 2==0)
			System.out.println("number is even");
		else
			System.out.println("number is odd");
		
	}

}
