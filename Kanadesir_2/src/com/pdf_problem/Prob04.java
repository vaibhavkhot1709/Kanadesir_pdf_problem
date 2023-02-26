package com.pdf_problem;

import java.util.Scanner;

//4. Accept L, B, H (Length, Breadth, Height) of Box & calculate volume. (V=L*B*H)

public class Prob04 {
			public static void main(String[] args) {
				volume();
			}

			private static void volume() {
				int l,b,h,v;
				Scanner in= new Scanner(System.in);
				System.out.println(" Enter valu of L B H");
				
				l=in.nextInt();
				b=in.nextInt();
				h=in.nextInt();
				
				v=l*b*h;
				System.out.println(" volume is "+v);
			}
}
