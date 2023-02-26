package com.array;

import java.util.Scanner;

// copy one array into another array//

public class CopyOneIntoAnother {
	
	public static void main(String[] args) {
		copyArray();
	}
	
	public static void copyArray() {
		Scanner in= new Scanner(System.in);
		int a[]= new int [5];
		int i;
		for(i=0;i<=4;i++) {
			System.out.println("enter an array");
			a[i]=in.nextInt();
		}
		int b[]=new int[5];
		for(i=0;i<=4;i++) {
			b[i]=a[i];
		}
		
		System.out.println("after copy new array !!!1");
		
		for(i=0;i<=4;i++) {
			System.out.println("b[i]" +"all element " +b[i]);
		}
		
	}

}
