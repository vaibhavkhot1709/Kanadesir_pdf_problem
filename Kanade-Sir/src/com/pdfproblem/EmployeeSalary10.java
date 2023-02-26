package com.pdfproblem;

import java.util.Scanner;

/*10. Take input Basic Salary of Employee 
  & add (H.R.A. 45%) (T.A. 25%) (D.A. 30%) 
 also deduct (M.A. 5%) (P.F. 25%) then calculate Net Salary.*/


public class EmployeeSalary10 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double bsallary;
		double nsallary;
		
		System.out.println("enter basic sallary of Vaibhav");
		bsallary=in.nextDouble();
		nsallary=sallary(bsallary);
		System.out.println("net sallary of Vaibhav !!! = "+nsallary);
		
		
		
		System.out.println("enter basic sallary of Shree");
		bsallary=in.nextDouble();
		nsallary=sallary(bsallary);
		System.out.println("net sallary of Shree !!! = "+nsallary);
		
		System.out.println("enter basic sallary of Renu");
		bsallary=in.nextDouble();
		nsallary=sallary(bsallary);
		System.out.println("net sallary of Renu !!! = "+nsallary);
		
		
		System.out.println("enter basic sallary of Pratiksha");
		bsallary=in.nextDouble();
		nsallary=sallary(bsallary);
		System.out.println("net sallary of Pratiksha !!! = "+nsallary);
		
		
		System.out.println("enter basic sallary of Vaibhav G");
		bsallary=in.nextDouble();
		nsallary=sallary(bsallary);
		System.out.println("net sallary of Vaibhav G !!! = "+nsallary);
		
		
		System.out.println("enter basic sallary of Rushi");
		bsallary=in.nextDouble();
		nsallary=sallary(bsallary);
		System.out.println("net sallary of Rushi !!! = "+nsallary);
	}

	private static double sallary(double bsallary) {
		// TODO Auto-generated method stub
		double hra,ta,da,ma,pf,nsallary;
		hra=0.45*bsallary;
		ta=0.25*bsallary;
		da=0.30*bsallary;
		ma=0.05*bsallary;
		pf=0.25*bsallary;
		nsallary=bsallary+hra+ta+da-ma-pf;
		return nsallary;
		
	}
}
