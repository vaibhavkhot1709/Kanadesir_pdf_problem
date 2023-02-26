package com.switchcase;

//23. Create Calculator using Switch-Case.//

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator();
	}

	private static void calculator() {
		// TODO Auto-generated method stub
		
		Scanner in= new Scanner(System.in);
		System.out.println("entre num1 and num2");
		
		int num1,num2,res;
		num1=in.nextInt();
		num2=in.nextInt();
		
		System.out.println(" entre string + / - / * / / / %  ");
		String s=in.next();
		
		switch (s) {
		case "+": res=num1+num2;
		System.out.println("addition is= "+res);
		break;
		
		case "-": res=num1-num2;
		System.out.println("substraction is = "+res);
		break;
		
		case "*": res=num1*num2;
		System.out.println("multiplication is = "+res);
		break;
		
		case "/": res=num1/num2;
		System.out.println("devision is= "+res);
		
		
		case "%": res=num1%num2;
		System.out.println("modulo is= "+res);
		}
		
		
		
		
	}
	

}
