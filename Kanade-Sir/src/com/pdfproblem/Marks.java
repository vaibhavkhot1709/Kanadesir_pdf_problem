package com.pdfproblem;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		totalMarks();
				
	}
	
	public static void totalMarks(){
			Scanner in= new Scanner(System.in);
		
		System.out.println("Enter marks of all subjects");
		
		double s1=in.nextDouble();
		double s2=in.nextDouble();
		double s3=in.nextDouble();
		double s4=in.nextDouble();
		double s5=in.nextDouble();
		
		double t=s1+s2+s3+s4+s5;
		System.out.println("total marks is = "+t);
		
		double avr=t/5;
		System.out.println("average marks is = " +avr);
	}
	
}

