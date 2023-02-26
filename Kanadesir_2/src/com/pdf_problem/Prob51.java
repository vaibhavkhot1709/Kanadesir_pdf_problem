package com.pdf_problem;

import java.util.Scanner;

//51. Accept value of ‘x’ & ‘y’ then calculate xy
public class Prob51 {
	int x,y,res=1;
	public static void main(String[] args) {
		Prob51 p=new Prob51();
		p.square();
	}
	
	public void square() {
		Scanner in=new Scanner(System.in);
		System.out.println(" enter value of x and y");
		
		x=in.nextInt();
		y=in.nextInt();
		for(int i=1;i<=y;i++) {
			res*=x;
			System.out.println(res);
		}
	}

}
