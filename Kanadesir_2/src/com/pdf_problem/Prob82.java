package com.pdf_problem;

import java.util.Scanner;

public class Prob82 {

//	82. Copy one String into Another.

	public static void main(String[] args) {

		String s1 = "my name is vaibhav khot";

		String ss = String.valueOf(s1);

		System.out.println(ss);

		char ch[] = s1.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {

//			System.out.print(ch[i]);

		}
	}

}
