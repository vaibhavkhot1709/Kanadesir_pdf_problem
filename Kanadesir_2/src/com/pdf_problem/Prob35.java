package com.pdf_problem;

////36. Calculate Multiplication of 1 to 10 Numbers//

public class Prob35 {
	public static void main(String [] arg )
	{
		numberAddition();
	}
	
	public static void numberAddition()
	{ 
		int add=0;
		for( int i=1;i<11;i++)
		{
			add+=i;
		} 
		System.out.println("addition = " +add);
	}
}
