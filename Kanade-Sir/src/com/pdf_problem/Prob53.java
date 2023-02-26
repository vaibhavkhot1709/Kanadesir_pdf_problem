package com.pdf_problem;

import java.util.Scanner;

//53. Accept any number & display it is Prime or Not.
public class Prob53 {
	public static void main(String[] args) {
		prime();
	}

	public static void prime() {
		Scanner in = new Scanner(System.in);
		System.out.println("enter any number ");
		int num = in.nextInt();
		for (int i = 2; i <= num/2; i++) {
			if (num % i == 0) {
				System.out.println("number is not prime number "+num);
			}
			else
				System.out.println("number is prime number ");

		}

	}

}
