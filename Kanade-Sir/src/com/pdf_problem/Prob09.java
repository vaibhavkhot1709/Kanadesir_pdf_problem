package com.pdf_problem;

import java.util.Scanner;

//9. Take input Lone Amount from customer & calculate interest Amount 12% per annual & then calculate Total amount.

public class Prob09 {
	public static void main(String arg [])
	{
		inputLoan();
	}
	
	public static void inputLoan()
	{
		Scanner in= new Scanner(System.in);
		
		System.out.println(" Enter loan amount");
		
		double loanAmount= in.nextDouble();
		
		double year = 1;
		double interest= 0.12* loanAmount;
		System.out.println(" interest amount= " + interest);
		
		double amount = loanAmount + interest;
		System.out.println(" total amount= " + amount);
		
		
	}

}
