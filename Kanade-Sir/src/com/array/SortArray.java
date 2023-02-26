package com.array;

import java.util.Scanner;

public class SortArray {
	public static void main(String[] args) {
		sortElement();
	}
	
	public static void sortElement() {
		
		Scanner in= new Scanner(System.in);
		int a[]= new int [5];
		int i,j,min,var=0;
		
		for(i=0; i<a.length; i++) {
			System.out.println("Enter any array ");
			a[i]=in.nextInt();
			
			min=i;    // to keep safe actual value of i//
			
			for(j=i+1;j<a.length;j++) {
				
				if(a[j]<a[i]) {
					
					min=j;
				}
			}
			var=a[i];
			a[i]=a[min];
			a[min]=var;
			
		}
		for(i=0;i<a.length;i++) {
			
			System.out.println(a[i]+" ");
		}
	
	}
}
