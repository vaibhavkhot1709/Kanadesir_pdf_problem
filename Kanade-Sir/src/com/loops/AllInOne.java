package com.loops;

/* accept number an show addition of all digit, 
separately digit show,reverse number, max and min digit*/

public class AllInOne {
	public static void main(String[] args) {
		reverse();
	}
	
	public static void reverse() {
		int num=234;
		int rem;
		int rev=0;
		
		while(num>=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		System.out.println("reverse number is rev= "+rev);
		
		
	}
	
}
