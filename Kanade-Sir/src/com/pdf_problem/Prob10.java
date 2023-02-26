package com.pdf_problem;

import java.util.Scanner;

//10. Take input Basic Salary of Employee & add (H.R.A. 45%) (T.A. 25%) (D.A. 30%) 
//also deduct (M.A. 5%) (P.F. 25%) then calculate Net Salary.


public class Prob10 {
	
	public static void main(String[] args) {
		sallary() ;
	}
	
	public static void sallary() {
		Scanner in =new Scanner(System.in);
		System.out.println("enetr sallary of employee!!");
		
		double sall=in.nextDouble();
		double ha=sall*0.45;
		double ta=sall*0.25;
		double da=sall*0.30;
		double ma=sall*0.05;
		double pf=sall*0.25;
		
		double netsall=sall+ha+ta+da-ma-pf;
		
		System.out.println("net sallary is "+netsall);
		
	}

}
