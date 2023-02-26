package com.pdf_problem;

import java.util.Scanner;

public class Prob85 {

//	85. Accept a Single character & Find into String.

	public static void main(String[] args) {

		String s1 = "Maharashtra";

		char ch[] = s1.toCharArray();

		Scanner sc = new Scanner(System.in);
		
		System.out.println("any char");
		
		char c = sc.next().charAt(0);
		
		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == c) {
				System.out.println("given char " + c + " is present in string at " + i);
			}
			

		}

	}
}
