package com.pdf_problem;

//39. Calculate Factorial of 5.//

public class Prob39 {

	public static void main(String[] arg) {
		factorial();
	}

	public static void factorial() {
		int i, fact = 1;
		int n = 5;

		for (i = 1; i <= n; i++) {
			fact *= i;
		}
		System.out.println("factorial of 5 is " + fact);
	}
}
