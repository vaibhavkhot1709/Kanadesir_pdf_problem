package com.nestedloop;

public class DisplayStar8 {
	public static void main(String[] args) {
		displayNumber();
	}
	
	public static void displayNumber() {
		int i,j,m;
		for(i=5;i>=1;i--) {
			System.out.print("\n");
			for(j=5;j>=i;j--) {
				System.out.print("\t"+j);
				
			}
			
		}
	}
	

}
/*	
    5
	5	4
	5	4	3
	5	4	3	2
	5	4	3	2	1   */