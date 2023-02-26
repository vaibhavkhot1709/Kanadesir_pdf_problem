package com.pdf_problem;

import java.util.Scanner;

//18. Accept 3 different number’s & display Larger number

public class Prob18 {

	public static void main(String arg[]) {
		larger();
	}

	public static void larger() {
		Scanner in = new Scanner(System.in);

		System.out.println(" Enter three numbers !!!");

		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println(" num1 is greater than num2 and num3 !!!");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(" num2 is greater than num1 and num3 !!!");
		}

		else if (num3 > num1 && num3 > num2) {
			System.out.println(" num3 is greater than num1 and num2!!!");
		}

	}

}
