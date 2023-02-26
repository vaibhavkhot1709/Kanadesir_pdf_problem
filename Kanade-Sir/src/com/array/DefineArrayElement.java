package com.array;

//Define an array having 5 elements, store values into it and then display on screen//

import java.util.Scanner;

public class DefineArrayElement {
	public static void main(String [] arg)
	{
		defineArray();
	}
	
	public static void defineArray()
	{
		Scanner in= new Scanner(System.in);
		
		int a[] = new int[5];    // array defining //
		int i;
		
		for(i=0;i<=4;i++)
		{
			System.out.println(" Entre any value");  
			a[i]=in.nextInt();
		}
		
		System.out.println("Array values are ");
		
		for(i=0; i<=4;i++)
		{
			System.out.println("\n " +a[i]);
		}
			
			
			
	}
	
}
