package com.array;

import java.util.Scanner;

public class SearchElement {
	public static void main(String[] args) {
		
	}
	
	public static void search() {
		
		Scanner in= new Scanner(System.in);
		
		int a[]=new int[5];
		
		int i,count=0;
		int n=in.nextInt();
		
		for(i=0;i<a.length;i++) {
			
			System.out.println("Enter any array");
						
			a[i]=in.nextInt();
		}
		
		for(i=0;i<a.length;i++) {
			
			if(a[i]==n) {
				
				count++;
				
				
				
			}
		}
		
	}

}
