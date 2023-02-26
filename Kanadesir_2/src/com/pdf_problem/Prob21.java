package com.pdf_problem;

import java.util.Scanner;

//21. Accept Year & display it is Leap Year or Not.
public class Prob21 {

	public static void main(String[] args) {
		leapYear();
	}

	public static void leapYear() {
			Scanner in= new Scanner(System.in);
			System.out.println("enter any year ");
			int year=in.nextInt();
			
			if((year %400==0 )|| (year % 4==0 && year % 100==0))
				System.out.println(" year is leap year");
				else
					System.out.println(" is not an leap year");
	}

}
