package com.pdf_problem;

import java.util.Scanner;

//19. Accept 4 different number’s & display Smaller number.
public class Prob19 {
	public static void main(String[] args) {
		 smaller();
	}
	public static void smaller() {
		Scanner in = new Scanner(System.in);

		System.out.println(" Enter four numbers !!!");

		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		int num4 = in.nextInt();

		if (num1 < num2 && num1 < num3 && num1 < num4)
			System.out.println(" num1 is smaller than num2 and num3 and num4 !!!");
		else if (num2 < num1 && num2 < num3 && num2 < num4)
			System.out.println(" num2 is smaller than num1 and num3 and num4 !!!");
		else if (num3 < num1 && num3 < num2 && num3 < num4)
			System.out.println(" num1 is smaller than num1 and num2 and num4!!!");
		else if (num4 < num1 && num4 < num2 && num4 < num3)
			System.out.println(" num4 is smaller than num1 and num2 and num3!!!");

	}

}
