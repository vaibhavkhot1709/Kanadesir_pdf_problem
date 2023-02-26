package com.breaks;

//60. Print 1 to 10 Numbers on Screen 
//But if value becomes 7 Skip this value using continue statement.

public class Continue60 {
	public static void main(String[] args) {
		printNumbers();
	}
	
	public static void printNumbers()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			if(i==7)
				continue;
			System.out.println(i);
			
		}
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
		
		System.out.println(" same example with break statment");
		
		
		for(i=1;i<=10;i++) 
		{
			if(i==7)
			break;
			System.out.println(i);
			
		}
	}

}
