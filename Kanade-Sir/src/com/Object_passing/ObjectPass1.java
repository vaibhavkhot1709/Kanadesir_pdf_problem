package com.Object_passing;

import java.util.Scanner;

public class ObjectPass1 {
	int acno;
	String nm;

	public void accept() {
		Scanner in = new Scanner(System.in);
		System.out.println(" enter account number and name ");
		acno = in.nextInt();
		nm = in.next();
	}

	public void display() {
		System.out.println("account number is " + acno);
		System.out.println("name of account holder is " + nm);
	}

	public static void main(String[] args) {
		ObjectPass1 o = new ObjectPass1();
		o.accept();
		o.display();

	}

}
