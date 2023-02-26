package com.loops;

//41. accept ten value and find negative and positive

import java.util.Scanner;

public class NegativePositive {
	

	public static void main(String[] args) {
		negPosValues();
	}
		
	 
	
	public static void negPosValues(){
		
		Scanner in= new Scanner(System.in);
		
		int a[]= new int[10];
		int i;
		
		for(i=0; i<a.length;i++) {
			
			System.out.println("entre any value");
			
			a[i]=in.nextInt();
			
			
		}
		
		for(i=0;i<a.length;i++) {
			
			if(a[i]<0) {
				
				System.out.println(a[i] + "  is negative number");
			}
			
			else {
				System.out.println(a[i] + "  is positive number");
			}
		}
	}
}
