package com.loops;

import java.util.Scanner;

// calculate factorial of 5//

public class FactorialInput {
	public static void main(String[] args) {
		factorial();
	}
	
	public static void factorial() {
		Scanner in= new Scanner(System.in);
		System.out.println("enter any value");
		int num=in.nextInt();
		int i;
		int num2=1;
		for(i=1;i<=num;i++) {
			
			num2*=i;
			
		}
		System.out.println("factorial of f is = " +num2);
	}

}

