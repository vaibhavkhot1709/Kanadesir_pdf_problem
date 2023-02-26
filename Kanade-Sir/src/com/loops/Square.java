package com.loops;

//34. Calculate Square of 1 to 10 Numbers.//

public class Square {
	
	public static void main(String[] args) {
		square();
	}
	
	public static void square() {
		for(int i =1;i<=10;i++) {
			
			int s=i*i;
			
			System.out.println("square of "+i + "  =  "  +s );
		}
	}

}
