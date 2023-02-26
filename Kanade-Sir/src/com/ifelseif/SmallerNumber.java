package com.ifelseif;
//System.out.println("num3 is smaller than all");//
import java.util.Scanner;

public class SmallerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		smallerNumber();
	}
	
	public static void smallerNumber() {
		Scanner in= new Scanner(System.in);
		
		System.out.println("entre four numbers!!!");
		
		int num1=in.nextInt();
		int num2=in.nextInt();
		int num3=in.nextInt();
		int num4=in.nextInt();
		
		if(num1<num2) {
			
			if(num1<num3) {
				if(num1<num4) {
					System.out.println("num1 is smaller than all= " +num1);
				}
				else if(num1>num4) {
					System.out.println("num4 is smaller than all= "+num4);
				}
			}
			else{
				
				if(num3<num4) {
					System.out.println("num3 is smaller than all");
				}
				else if(num3>num4) {
					System.out.println("num4 is smaller than all");
				}
				
			}
		}
		else if(num2<num3) {
			if(num2<num4) {
				System.out.println("num2 is smaller than all");
			}
			else if(num2>num4){
				System.out.println("num4 is smaller than all");
			}
		}
		else if(num3<num4) {
			System.out.println("num3 is smaller than all");
		}
		else {
			System.out.println("num4 is smaller than all");
		}
	}

}
