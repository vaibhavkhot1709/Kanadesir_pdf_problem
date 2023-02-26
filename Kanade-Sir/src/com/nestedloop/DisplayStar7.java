package com.nestedloop;

public class DisplayStar7 {
	public static void main(String[] args) {
		displayNumber();
	}
	
	public static void displayNumber() {
		int i,j,m;
		for(i=1;i<=5;i++) {
			System.out.print("\n");
			for(j=5;j>=i;j--) {
				System.out.print(" ");
				
			}
			for(m=1;m<=i;m++) {
				System.out.print("*");
			}
		}
	}
	

}
/*	
     *
    **
   ***
  ****
 ******/