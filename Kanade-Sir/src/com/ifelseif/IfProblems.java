package com.ifelseif;

import java.util.Scanner;

//15. Accept any number & display it is Positive or Negative.//

public class IfProblems {
	public static void main(String[] args) {
		posnegNumber();
	}

	private static void posnegNumber() {
		Scanner in= new Scanner(System.in);
		System.out.println("Entre any number !!!");
		int num=in.nextInt();
		
		if(num>0) {
			System.out.println("Number is Possitive!!!");
		}
		else
			System.out.println("Number is Negative!!!");
	}
	
	

}
