package com.array;

import java.util.ArrayList;

// Calculate addition of all elements of array //

import java.util.Scanner;

public class AdditionArray {
	public static void main(String[] args) {
		addition();
	}
	public AdditionArray(){
		
	}
	
	public static void addition() {
		Scanner in= new Scanner(System.in);
		int a[]= new int[5];
		int i, total=0;
		for(i=0;i<=4;i++) {
			System.out.println("entre any value");
			a[i]=in.nextInt();
		}
		
		for(i=0;i<=4;i++) {
			
			total +=a[i];
		}
		
		System.out.println("sum of all elements = " +total);
		
		ArrayList<Integer> arrayList=new ArrayList<>();
//		arrayList.str
	}
}
