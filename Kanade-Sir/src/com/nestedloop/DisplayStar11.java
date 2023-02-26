package com.nestedloop;

public class DisplayStar11 {
	public static void main(String[] args) {
		displayNumber();
	}
	
	public static void displayNumber() {
		int i,j,m;
		for(i=1;i<=5;i++) {
			System.out.print("");
			for(j=5;j<=i;j--) 
				System.out.print(" ");
			for(m=1;m<=i;m++)
				System.out.println(+m);
				
			
		
		}
	}
	

}
/*	
      *
     * *
    * * *
   * * * *
  * * * * *
  
   
 */