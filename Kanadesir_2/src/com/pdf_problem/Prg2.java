package com.pdf_problem;

import java.util.Scanner;

// 3. Accept 5 Subject Mark’s & calculate Total marks & Average..

public class Prg2 {
	public static void main(String arg []){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks of sub1, sub2 ,sub3, sub4,sub5");
		double sub1=sc.nextInt();
		double sub2=sc.nextInt();
		double sub3=sc.nextInt();
		double sub4=sc.nextInt();
		double sub5=sc.nextInt();
		double totalmarks =sub1+sub2+sub3+sub4+sub5;
		double avg=totalmarks/5;
		
		System.out.println("avg marks are : "+avg);

		}

}
