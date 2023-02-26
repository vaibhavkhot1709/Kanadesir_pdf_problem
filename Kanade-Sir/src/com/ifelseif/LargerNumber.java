package com.ifelseif;

import java.util.Scanner;

//18. Accept 3 different number’s & display Larger number.//

public class LargerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargerNumber ln= new LargerNumber();
		ln.largerNumber();
	}
	
	public  void largerNumber() {

		Scanner in= new Scanner(System.in);
		System.out.println("entre three numbers");
	
		int num1=in.nextInt();
		int num2=in.nextInt();
		int num3=in.nextInt();
		
		if(num1>num2) {
			if(num1>num3) {
				System.out.println("num1 is greater than all = "+num1);
			}
			else if(num1<num3) {
				System.out.println("num3 is greater than all = "+num3);
			}
		}
		
		if(num1<num2) {
			if(num2>num3) {
				System.out.println("num2 is greater than all = "+num2);
				
			}
			else if(num2<num3) {
				System.out.println("num3 is greater than all = "+num3);
			}
		}
		
	}

}
