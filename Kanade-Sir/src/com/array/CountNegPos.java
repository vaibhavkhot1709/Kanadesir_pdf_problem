package com.array;

import java.util.Scanner;

// count negative and positive value//

public class CountNegPos {
	public static void main(String[] args) {
		count();
	}
	
	public static void count() {
		
		Scanner in= new Scanner(System.in);
		
		int a[]= new int [5];
		int i, c1=0,c2=0;
		
		for(i=0;i<=4;i++) {
			
			System.out.println(" Enter any array");
			
			a[i]=in.nextInt();
			
			
		}
		
		
		for(i=0;i<=4;i++) {
			if(a[i]<0) {
				System.out.println("\n" + a[i] + " negative number");
				c1++;
			}
			
			else {
				
				System.out.println("\n" + a[i] + " positive number");
				c2++;
			}
		}
		
		System.out.println("\n negative number are = " +c1);
		
		System.out.println("positive number are = "+c2);
	}

}
