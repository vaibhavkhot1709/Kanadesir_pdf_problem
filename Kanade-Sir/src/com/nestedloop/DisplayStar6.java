package com.nestedloop;

public class DisplayStar6 {
	public static void main(String[] args) {
		displayNumber();
	}
	
	public static void displayNumber() {
		int i,j;
		for(i=1;i<=5;i++) {
			System.out.println("\n");
			for(j=5;j>=i;j--) {
				System.out.print(j);
			}
				
		}
	}
	

}
/*	
54321

5432

543

54

5*/