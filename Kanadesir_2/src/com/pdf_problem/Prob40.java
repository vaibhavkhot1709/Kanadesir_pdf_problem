package com.pdf_problem;

//40. Accept value of ‘n’ & calculate it’s Factorial.//
import java.util.Scanner;

public class Prob40 {

	public static void main(String[] arg) {
		factorial();
	}

	public static void factorial() {
		Scanner in = new Scanner(System.in);
		System.out.println("enter any number");
		int n = in.nextInt();
		int i, fact = 1;

		for (i = 1; i <= n; i++) {
			fact *= i;
		}
		System.out.println("factorial of n is " + fact);
	}
}