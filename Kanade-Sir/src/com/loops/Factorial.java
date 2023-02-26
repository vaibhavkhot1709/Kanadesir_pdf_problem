package com.loops;

// calculate factorial of 5//

public class Factorial {
	public static void main(String[] args) {
		factorial();
	}
	
	public static void factorial() {
		
		int i;
		int fa=1;
		for(i=1;i<=5;i++) {
			
			fa=fa*i;
			
		}
		System.out.println("factorial of f is = " +fa);
	}

}
