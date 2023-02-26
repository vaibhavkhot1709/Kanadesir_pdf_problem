package com.ifelseif;

/*22. Infosys want’s to hire a Driver having following criteria’s.
a. Age must be Greater than 40.
b. Driving Experience Greater than 10 Years.
c. 12th Mark’s Greater than 60.*/

import java.util.Scanner;

public class DriverJob {
	 public static void main(String[] args) {
		driverJob();
	}

	private static void driverJob() {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println(" enter Age of applicant");
		int age=in.nextInt();
		
		System.out.println(" enter Experience of applicant");
		int exp=in.nextInt();
		
		System.out.println(" enter 12th marks of applicant");
		double marks=in.nextDouble();
		
		if(age>40 && exp>10 && marks>60) {
			System.out.println("congrats you can Applly for Driver  job");
		}
		else {
			System.out.println("sorry you are not fit in criteria");
		}
		
	}
}
