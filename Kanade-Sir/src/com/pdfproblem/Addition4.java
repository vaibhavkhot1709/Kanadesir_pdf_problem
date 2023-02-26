package com.pdfproblem;

// calculate addition by passing parameters and static to non static calling//

public class Addition4 {

	public static void main(String [] arg) {
		Addition4 sc1=new Addition4();
		sc1.addition(10,20);
		//object is required to calling static to non static//
	}
	
	public final int addition(int a,int b){
		
		int c= a+b;
		System.out.println(" addition is= " +c);
		Addition4 sc2=new Addition4();
		sc2.substraction(20,10);
		return c;
		
		//object is required to calling static to non static//
	}

	public final void substraction(int a, int b) {
		
		int c=a-b;
		System.out.println("substraction is = "+c);
	}
}


