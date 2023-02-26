package com.loops;

import java.util.Scanner;

//53. Accept any number & display it is Prime or Not.//

public class PrimeNumber {
	public static void main(String[] args) {
		primeNumber();
		
	}
	public static void primeNumber() {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter any number!!");
		
		int num=in.nextInt();
		int count=0;
		
		for(int i=2;i<=num/2;i++) {
		
			if(num%i==0) {
				
				count++;
			}
			
		}
			if(count==0) {
				System.out.println("number is prime");
			}
			else {
				System.out.println("number is not prime");
			}
	
	}

}
