package com.pdf_problem;

public class Prob81 {

//	81. Display Reverse String.

	public static void main(String[] args) {

		String s1 = "my name is vaibhav khot";

		char ch[] = s1.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {

			System.out.print(ch[i]);

		}
	}

}
