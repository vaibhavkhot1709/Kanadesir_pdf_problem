package com.pdf_problem;
//43. Accept number & count total digits of number.//

import java.util.Scanner;

public class Prob43 {
	public static void main(String[] arg) {
		countOfDigitd();
	}

	public static void countOfDigitd() {
		Scanner in = new Scanner(System.in);
		System.out.println(" enter any number");

		int n = in.nextInt();
		int count = 0;
		while (n > 0) {
			n = n / 10;
			count = count + 1;
		}
		System.out.println("sum is = " + count);
	}
}