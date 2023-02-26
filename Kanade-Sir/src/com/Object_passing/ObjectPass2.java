package com.Object_passing;

import java.util.Scanner;

class Bank{
	
	int acno;
	String nm;
	public void accept() {
		Scanner in= new Scanner(System.in);
		System.out.println(" enter account number and name ");
		acno=in.nextInt();
		nm=in.next();
	}
	
	public void display() {
		System.out.println("account number is "+acno);
		System.out.println("name of account holder is "+nm);
	}
	public Bank analysis(Bank x) {
		x.acno=20;
		x.nm="VDK";
		return x;
		
	}
}
public class ObjectPass2 {
	public static void main(String[] args) {
		Bank o=new Bank();
		o.accept();
		o.display();
		
		System.out.println(">>>>>>>>>>>>>>");
		
		Bank b=new Bank();
		b=b.analysis(o);
		b.display();
		
	}
	
	

}
