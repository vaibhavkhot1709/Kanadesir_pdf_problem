package com.loops;

import java.util.Scanner;

// accept any value and Multiplication up to one//

public class MultiplicationUptoOne {
	public static void main(String[] args) {
		multiplication();
	}
	
	public static void multiplication(){
		
		Scanner in= new Scanner(System.in);
		int i;
	
		System.out.println("Entre any value");
		int num=in.nextInt();
		int mul=1;
		for(i=num;i>=1;i--) {
				mul=mul*i;
			System.out.println(" multiplication is  = "+mul);
		}
	
		
	}
}

