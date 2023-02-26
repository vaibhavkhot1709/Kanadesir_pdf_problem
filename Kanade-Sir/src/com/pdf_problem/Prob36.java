package com.pdf_problem;

//35. Calculate addition of 1 to 10 Numbers.//

public class Prob36 {

	public static void main(String[] arg) {
		numberMultiplication();
	}

	public static void numberMultiplication() {
		int mul = 1;
		for (int i = 1; i < 11; i++) {
			mul *= i;

		}
		System.out.println(" multiplication of numbers  " + mul);
	}
}
