package com.array;

import java.util.Scanner;

//Find Elements is negative or positive// 

public class NegPosArray {
	
	public static void main(String[] args) {
		negPosValues();
	}
	
	public static void negPosValues(){
		
		Scanner in= new Scanner(System.in);
		
		int a[]= new int[5];
		int i;
		
		for(i=0; i<=4;i++) {
			
			System.out.println("entre any value");
			
			a[i]=in.nextInt();
			
			
		}
		
		for(i=0;i<=4;i++) {
			
			if(a[i]<0) {
				
				System.out.println(a[i] + "  is negative number");
			}
			
			else {
				System.out.println(a[i] + "  is positive number");
			}
			
			
		}
	}

}
