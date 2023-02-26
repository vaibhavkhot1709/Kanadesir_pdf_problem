package com.pdf_problem;

import java.util.Scanner;

public class Prob49 {
	public static void main(String[] args) {
		armstrongNumber();
	}

	public static void armstrongNumber() {
			int rem,rev=0;
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("enter any number");
		
		int num=in.nextInt();
		int temp=num;
		int lengh=0;
		while(temp!=0) {
			lengh+=1;
			temp/=10;
		}
		int temp2=num;
		while(temp2!=0) {
			
			temp=temp2%10;
		}
		
	}

		
}
