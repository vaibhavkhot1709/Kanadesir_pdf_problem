package com.nestedloop;

public class DisplayStar9 {
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
				System.out.print(+m);
			}
		}
	}
	

}
/*	
     1
    12
   123
  1234
 12345
 
 */