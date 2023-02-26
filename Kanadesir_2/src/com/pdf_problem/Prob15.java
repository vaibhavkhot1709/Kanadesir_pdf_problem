package com.pdf_problem;

import java.util.Scanner;

//15. Accept any number & display it is Positive or Negative.

public class Prob15 {
	public static void main(String[] args) {
		posNegValue();
	}

	public static void posNegValue() {
		Scanner in= new Scanner(System.in);
		System.out.println("enter any number");
		
		int num=in.nextInt();
		
		if(num>0)
			System.out.println(" number is possitive number");
		
	}

}
