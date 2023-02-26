package com.pdf_problem;

import java.util.Scanner;

//17. Accept Mark’s & display Pass or Fail.

public class Prob17 {
	public static void main(String [] arg)
	{
		passFail();
	}
	public static void passFail()
	{
		Scanner in= new Scanner(System.in);
		System.out.println(" Enter Marks");
		int marks=in.nextInt();		
		if(marks>40)
		System.out.println(" You are PASS !!!");
		else
			System.out.println(" You are FAILL !!!");
	}

}
