package com.pdfproblem;

import java.util.Scanner;

public class VolumeOfBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		volume();
	}

	public static void volume() {
		// TODO Auto-generated method stub
		
		Scanner in= new Scanner(System.in);
		System.out.println("Enter value of l, b , h");
		
		double l=in.nextDouble();
		double b=in.nextDouble();
		double h=in.nextDouble();
		
		double volm=l*b*h;
		
		System.out.println("volume of give box is = "+volm);
		
	}

}
