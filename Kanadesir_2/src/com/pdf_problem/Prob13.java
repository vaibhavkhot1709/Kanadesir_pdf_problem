package com.pdf_problem;

import java.util.Scanner;

//13. Accept value’s of (x & y) and solve following Expression. (Z=(4x2+5y3)/2xy)

public class Prob13 {
		public static void main(String[] args) {
			equation();
		}

		public static void equation() {
			Scanner in = new Scanner(System.in);
			System.out.println("En ter value of x and y");
			
			int x= in.nextInt();
			int y=in.nextInt();
			
			int z=((4*x*x+5*y*y*y)/2*x*y);
			System.out.println(" result of equation is "+z);
		} 
}
