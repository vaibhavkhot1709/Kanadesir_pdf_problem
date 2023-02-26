package com.pdfproblem;

//8. Accept Bill Amount & calculate 18% GST Amount & Net Amount.//
import java.util.Scanner;

public class BillAmount {

		public static void main(String[] args) {
			netAmount();
		}

		private static void netAmount() {
			// TODO Auto-generated method stub
			
			Scanner in= new Scanner(System.in);
			
			System.out.println("Enter bill Amount!!!!");
			
			double bill=in.nextDouble();
			
			double gst=0.18*bill;
			
			System.out.println("gst to bill = "+gst);
			
			double net=gst+bill;
			
			System.out.println("the net amount = "+net);
			
			
		}
		
}
