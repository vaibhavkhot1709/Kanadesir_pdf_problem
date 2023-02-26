package com.pdf_problem;

import java.util.Scanner;

//14. Accept any number & display Result after module by 10.

public class Prob14 {
		public static void main(String[] args) {
			module();
		}

		public static void module() {
		Scanner in= new Scanner(System.in);
		System.out.println(" enter any number");
		
		int num=in.nextInt();
		int mod=num%10;
		
		System.out.println("result after mod by 10 is "+mod);
			
		}
}
