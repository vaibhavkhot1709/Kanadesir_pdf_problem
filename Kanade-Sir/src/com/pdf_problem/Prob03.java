package com.pdf_problem;

//3. Accept 5 Subject Mark’s & calculate Total marks & Average.
import java.util.Scanner;

public class Prob03 {
	public static void main(String [] arg)
	{
		totalMarks();
	}
	
	public static void totalMarks()
	{
		int s1,s2,s3,s4,s5,total,avg;
		Scanner in= new Scanner(System.in);
		System.out.println("Enter marks of five subjects");
		
		s1=in.nextInt();
		s2=in.nextInt();
		s3=in.nextInt();
		s4=in.nextInt();
		s5=in.nextInt();
		
		total=s1+s2+s3+s4+s5;
		avg= total/5;
		
		System.out.println(" total of marks is= " +total);
		System.out.println("avg of marks is " +avg);
		
	}
}
