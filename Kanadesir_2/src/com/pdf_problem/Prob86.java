package com.pdf_problem;

import java.util.Scanner;

public class Prob86 {

//	 86. Accept a character & Display how many times Repeated into the String.

	public static void main(String[] args) {

		String s1 = "Maharashtra";

		char ch[] = s1.toCharArray();

		Scanner sc = new Scanner(System.in);

		System.out.println("any char");

		char character = sc.next().charAt(0);
		int count = 0;
		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == character) {

				count++;
			}

		}
		
		System.out.println("given char  '"+character+"' count of character "+ count);

	}
	
}
