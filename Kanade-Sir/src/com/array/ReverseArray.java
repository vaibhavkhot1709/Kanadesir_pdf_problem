package com.array;

//Display all value in reverse order?///

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse();
	}
	
	public static void reverse() {
		Scanner in = new Scanner(System.in);
		int a[]=new int[5];
		int i;
		
		for(i=0;i<=4;i++) {
			System.out.print("\n\t entre any number ");
			a[i]=in.nextInt();
		}
		System.out.println("\n\t Display value in reverse order");
		
		for(i=4;i>=0;i--) {
			System.out.println("\n" +a[i]);
		}
	}

}
