package com.array;

// Calculate square of all elements of array//

import java.util.Scanner;

public class SquareOfElement {
	public static void main(String[] args) {
		square();
	}
	
	public static void square() {
		Scanner in= new Scanner(System.in);
		int a[]= new int[5];
		int i, square=0;
		for(i=0;i<=4;i++) {
			System.out.println("entre any value");
			a[i]=in.nextInt();
		}
		
		for(i=0;i<=4;i++) {
			
			square =a[i] * a[i];
			System.out.println("square elements = " +square);
		}
		
	}
}
