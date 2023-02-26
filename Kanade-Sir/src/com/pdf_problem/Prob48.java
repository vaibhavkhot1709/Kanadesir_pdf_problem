package com.pdf_problem;

import java.util.Scanner;

//48. Accept number & find Palindrome or Not.

public class Prob48 {
	public static void main(String[] args) {
		palindrome();
	}
	
	public static void palindrome() {
		
		
		int rem,rev=0;
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("enter any number");
		
		int num=in.nextInt();
		int temp=num;
		while(temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp/=10;
		}
		
		if(num==rev)
			System.out.println(+num+" number is Palindrome number");
		else
			System.out.println(+num+" number is not polindrome");
	}

}
