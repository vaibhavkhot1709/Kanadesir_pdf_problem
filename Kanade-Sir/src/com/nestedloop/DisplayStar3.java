package com.nestedloop;

public class DisplayStar3 {
	public static void main(String[] args) {
		displayNumber();
	}
	
	public static void displayNumber() {
		int i,j;
		for(i=1;i<=5;i++) {
			System.out.println("\n");
			for(j=i;j>=1;j--) {
				System.out.print(j);
				
			}
				
		}
	}
	

}
/*
1

21

321

4321

54321
	*/



