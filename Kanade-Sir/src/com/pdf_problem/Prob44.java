package com.pdf_problem;

//44. Accept number and display in reverse order.//
import java.util.Scanner;

public class Prob44 {
	public static void main(String[] arg) {
		reverseOfDigitd();
	}

	public static void reverseOfDigitd() {
		Scanner in = new Scanner(System.in);
		System.out.println(" enter any number");
		int n = in.nextInt();
		int rem;
		int rev = 0;
		while (n > 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		System.out.println("sum is = " + rev);
	}
}