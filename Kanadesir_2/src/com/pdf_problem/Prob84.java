package com.pdf_problem;

public class Prob84 {

	// 84. Find a Position of character ‘r’.

	public static void main(String[] args) {

		String s1 = "Maharashtra";

		char ch[] = s1.toCharArray();

		char c='r';
		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == c) {
				System.out.println("r is present in string at " + i);
			}

		}

	}
}
