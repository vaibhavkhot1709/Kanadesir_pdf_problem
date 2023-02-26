package com.pdf_problem;

//28. Display 0, 2, 4, 6…., 100 (Even Numbers).

public class Prob28 {

	public static void main(String [] arg)
	{
		oddNumbers();
	}
	
	public static void oddNumbers()
	{
		for(int i=0;i<101;i++)
		{
			if (i%2==0)
				System.out.println(i);
		}
	}
}
