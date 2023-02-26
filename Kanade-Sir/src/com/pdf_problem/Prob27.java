package com.pdf_problem;

//27. Display 1, 3, 5, 7…., 99 (Odd Numbers).//

public class Prob27 {

	public static void main(String [] arg)
	{
		oddNumbers();
	}
	
	public static void oddNumbers()
	{
		for(int i=0;i<100;i++)
		{
			if (i%2!=0)
				System.out.println(i);
		}
	}
}
