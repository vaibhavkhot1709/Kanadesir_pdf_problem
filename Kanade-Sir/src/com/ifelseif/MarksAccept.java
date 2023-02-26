package com.ifelseif;

import java.util.Scanner;

//17. Accept Mark’s & display Pass or Fail.//


public class MarksAccept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marksInput();
	}
	
	public static void marksInput(){
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("enter marks ");
		
		double marks=in.nextDouble();
		
		if(marks>= 40 )
		{
			System.out.println("Congrats You are Pass !!!");
			System.out.println("Best wishesh for Future!!!");
			
		}
		
		else
		{
			System.out.println("You are Fail !!!");
			System.out.println("Better Luck for NextTime!!");
		}
	}

}
