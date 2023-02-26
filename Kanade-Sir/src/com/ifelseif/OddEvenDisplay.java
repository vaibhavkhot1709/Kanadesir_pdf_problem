package com.ifelseif;

import java.util.Scanner;

//20. Accept any number & display it is Odd or Even.//

public class OddEvenDisplay {
	public static void main(String[] args) {
		oddEven();
	}

	private static void oddEven() {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		System.out.println("entre any number !!! ");
		
		int num=in.nextInt();
		
		if(num%2==0) {
			System.out.println("given number is Even= "+num);
		}
		else {
			System.out.println("given number is odd = "+num);
		}
		
	}
}
