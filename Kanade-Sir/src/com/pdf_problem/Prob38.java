package com.pdf_problem;

import java.util.*;
//38. Accept any value and calculate multiplication upto 1//

public class Prob38 {

	public static void main(String[] arg) {
		numberMultiplication();
	}

	public static void numberMultiplication() {
		Scanner in = new Scanner(System.in);
		System.out.println(" enter any number ");
		int num = in.nextInt();
		int mul = 1;
		for (int i = num; i > 0; i--) {
			mul *= i;

		}
		System.out.println(" multiplication of numbers  " + mul);
	}

}