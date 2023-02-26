package com.pdf_problem;
//37. Calculate Multiplication of 10 to 1 Numbers

public class Prob37 {
	public static void main(String[] arg) {
		numberMultiplication();
	}

	public static void numberMultiplication() {
		int mul = 1;
		for (int i = 10; i < 0; i--) {
			mul *= i;

		}
		System.out.println(" multiplication of numbers  " + mul);
	}

}
