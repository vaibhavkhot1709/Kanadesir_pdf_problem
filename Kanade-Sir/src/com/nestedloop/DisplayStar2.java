package com.nestedloop;

public class DisplayStar2 {
	public static void main(String[] args) {
		displayNumber();
	}
	
	public static void displayNumber() {
		int i,j,a=0;
		for(i=1;i<=5;i++) {
			System.out.println("\n");
			for(j=1;j<=i;j++) {
				a++;
				System.out.print("\t" +a);
				
			}
				
		}
	}
	

}
/*
	1

	2	3

	4	5	6

	7	8	9	10

	11	12	13	14	15*/



