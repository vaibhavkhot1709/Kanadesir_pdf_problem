package com.pdf_problem;
//23. Create Calculator using Switch-Case.
public class Prob23 {
	public static void main(String[] args) {
		calculator();
	}

	public static void calculator() {
		 int num1=20;
		 int num2=10;
		 int res;
		 String symb="+";
		 switch (symb) {
		 
		 case "+":res=num1+num2;
		 System.out.println("result is "+res);
		 break;
		 
		 case "-": res=num1-num2;
		 System.out.println(" result is "+res);
		 break;
		 
		 case "*": res=num1*num2;
		 System.out.println("result is "+res);
		 break;
		 
		 case "/": res=num1/num2;
		 System.out.println("result is  "+res);
		 break;
		 
		 default:
			 System.out.println(" no match");
		 
		 }
	}

}
