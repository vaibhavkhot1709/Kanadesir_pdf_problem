package com.ifelseif;

import java.util.Scanner;

//21. Accept Year & display it is Leap Year or Not.//

public class LeapYearDisplay {
	public static void main(String[] args) {
		leapYear();
	}

	private static void leapYear() {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		System.out.println("Entre year !!!!");
		
		int year=in.nextInt();
		
		if((year%400==0) || (year%4==0 && year/100 !=0)) {
			
			System.out.println("year is Leap year !!!");
		}
		else {
			System.out.println("year is not Leap Year!!!");
		}
	}
}
