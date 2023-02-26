package com.pdf_problem;

import java.util.Scanner;

//8. Accept Bill Amount & calculate 18% GST Amount & Net Amount.

public class Prob08 {
	
	public static void main (String arg [])
	{
		bill();
	}
	
	public static void bill()
	{
		Scanner in = new Scanner (System.in);
		
		System.out.println(" enter bill amount");
		
		double bill= in.nextDouble();
		
		double gst= 0.18 * bill;
		System.out.println(" gst ammount  =" +gst);
		
		double net= bill + gst;
		
		System.out.println(" net amount = " +net);
	}

}
