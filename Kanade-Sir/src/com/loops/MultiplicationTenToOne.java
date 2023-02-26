package com.loops;

public class MultiplicationTenToOne {
	public static void main(String[] args) {
		multiplication();
	}
	
	public static void multiplication(){
		
		int i, mul=1;
		for(i=10;i>=1;i--) {
			
			mul=mul*i;
			System.out.println(" multiplication is  = "+mul);
		}
	
		
	}
}

