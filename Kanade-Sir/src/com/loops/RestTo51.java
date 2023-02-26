package com.loops;

import java.util.Scanner;

//51. Accept value of ‘x’ & ‘y’ then calculate x^y//

public class RestTo51 {
	public static void main(String[] args) {
		restToMethod();
	}
	public static void restToMethod() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter value of x and y");
		
		int x= in.nextInt();
		int y=in.nextInt();
		int i,res=1;
		for(i=1;i<=y;i++) {
			
			res=res*x;
		}
		System.out.println("x ^ y = "+res);
		
	}

}
