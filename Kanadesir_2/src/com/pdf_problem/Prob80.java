package com.pdf_problem;

import java.util.Arrays;

public class Prob80 {

//	80. Count Total characters of String.


	public static void main(String[] args) {

		String s1 = "my name is vaibhav khot";

		char ch[] = s1.toCharArray();

		System.out.println(Arrays.toString(ch));
		int count = 0;
		int charpresent = 0;
		char c = ' ';

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == c) {

			} else
				charpresent++;

			count++;

		}

		System.out.println("length by count " + count);

		System.out.println("char present count " + charpresent);
	}

}
