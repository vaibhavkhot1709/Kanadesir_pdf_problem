package com.loops;

import java.util.Scanner;

// 44 accept any number and reverse order//

public class ReeverseNumber {
	
	public static void main(String[] args) {
		reverse();
	}
	
	public static void reverse() {
		Scanner in= new Scanner(System.in);
		System.out.println("Entre any number ");
		
		int num= in.nextInt();
		int remainder;
		int reverse=0;
		
		while(num>0) {
			remainder=num%10;
			reverse=reverse*10+remainder;
			num=num/10;
		}
		System.out.println("reverse number is =" +reverse);
		
	}
}
