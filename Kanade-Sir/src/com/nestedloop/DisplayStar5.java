package com.nestedloop;

public class DisplayStar5 {
	public static void main(String[] args) {
		displayNumber();
	}
	
	public static void displayNumber() {
		int i,j;
		for(i=1;i<=5;i++) {
			System.out.println("\n");
			for(j=1;j<=i;j++) {
				System.out.print(1);
			}
				
		}
	}
	

}
/*	
1

11

111

1111

11111*/