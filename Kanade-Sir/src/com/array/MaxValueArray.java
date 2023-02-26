package com.array;

import java.util.Scanner;

public class MaxValueArray {
	
	public static void main(String[] args) {
		maxValue();
	}

	private static void maxValue() {
		
		Scanner in= new Scanner(System.in);
		
		int a[]= new int [5];
		int i;
		for(i=0;i<=4;i++) {
			System.out.println("Enter any array value");
			a[i]=in.nextInt();
		}
		int max= a[0];
		
		for(i=1;i<=4;i++) {
			
			if(a[i]>max) {
				
				max=a[i];
			}
		}
		System.out.println("max array value is= " +max);
		
		
	}
}
