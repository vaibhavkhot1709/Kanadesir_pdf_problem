package com.ifelseif;

import java.util.Scanner;

//16. Take input 2 different number’s & display Greater & Smaller Number.//


public class SmallLargeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		smallLarge();
	}
	
	public static void smallLarge(){
		Scanner in= new Scanner(System.in);
		
		System.out.println("Entre two numbers !!!");
		
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int large;
		int small;
		
		if (num1>num2)
		{
			 large =num1;
			 small=num2;
			 
			 System.out.println("large number is= "+num1);
			 System.out.println("Small number is= "+num2);
			 
		}
		else
		{
			large=num2;
			small =num1;
			
			 System.out.println("large number is= "+num2);
			 System.out.println("Small number is= "+num1);
		}

	}
	

}
