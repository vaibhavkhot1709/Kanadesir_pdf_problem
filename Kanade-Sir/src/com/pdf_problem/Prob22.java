package com.pdf_problem;

import java.util.Scanner;

//22. Infosys want’s to hire a Driver having following criteria’s.
//a. Age must be Greater than 40.
//b. Driving Experience Greater than 10 Years.
//c. 12th Mark’s Greater than 60.


public class Prob22 {
		public static void main(String[] args) {
			driver();
		}

		public static void driver() {
				Scanner in= new Scanner(System.in);
				System.out.println("eneter data of applican");
				int age=in.nextInt();
				int exp=in.nextInt();
				int marks=in.nextInt();
				
				if(age>40 && exp>10 && marks>60)
					System.out.println("you can submit your application");
				else
					System.out.println("You are not eligible to apply");
		}
}
