package com.pdf_problem;
//42. Accept any number and calculate addition of digits.//

import java.util.Scanner;

public class Prob42 {
	public static void main(String[] arg) {
		additionOfDigitd();
	}

	public static void additionOfDigitd() {
		Scanner in = new Scanner(System.in);
		System.out.println(" enter any number");

		int n = in.nextInt();
		int rem, add = 0;
		while (n > 0) {
			rem = n % 10;
			add += rem;
			n /= 10;
		}
		System.out.println("sum is = " + add);
	}
}