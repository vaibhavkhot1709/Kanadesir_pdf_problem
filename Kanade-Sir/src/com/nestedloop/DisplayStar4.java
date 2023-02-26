package com.nestedloop;

public class DisplayStar4 {
	public static void main(String[] args) {
		displayNumber();
	}
	
	public static void displayNumber() {
		int i,j;
		for(i=5;i>=1;i--) {
			System.out.println("\n");
			for(j=1;j<=i;j++) {
				System.out.print("\t" +j);
			}
				
		}
	}
	

}
/*	
1	2	3	4	5

1	2	3	4

1	2	3

1	2

1*/