package com.pdfproblem;

/*9. Take input Lone Amount from customer & 
calculate interest Amount 12% per annual & then calculate Total amount.*/

import java.util.Scanner;

public class LoanAmount09 {

	public static void main(String[] args) {
		loan();
		
	}

	private static void loan() {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		 System.out.println("enter loan amount");
		 double lamount=in.nextDouble();
		 
		 System.out.println("enter year");
		 double year=in.nextDouble();
		 
		 
				 
		 double amount=(0.12* year)*lamount;
		 System.out.println("amount of interest= "+amount);
		 double tamount=amount+lamount;
		 System.out.println("total amount = "+tamount);
	}
}
