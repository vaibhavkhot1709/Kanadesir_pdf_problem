package com.pdf_problem;

//34. Calculate Square of 1 to 10 Numbers.//

public class Prob34 {

	public static void main(String [] arg )
	{
		numberDisplay();
	}
	
	public static void numberDisplay()
	{ 
		int squ;
		for( int i=1;i<11;i++)
		{
			squ=i*i;
			System.out.println(" square of " +i +" is  " +squ);
		} 
	}
}
