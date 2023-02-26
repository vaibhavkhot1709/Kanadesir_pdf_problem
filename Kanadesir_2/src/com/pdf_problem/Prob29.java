package com.pdf_problem;
//29. Display 0, 5, 10, 15…, 100 Numbers.

public class Prob29 {
	public static void main(String [] arg)
	{
		fiveTableNumbers();
	}
	
	public static void fiveTableNumbers()
	{
		for(int i=0;i<101;i++)
		{
			if (i%5==0)
				System.out.println(i);
		}
	}

}
