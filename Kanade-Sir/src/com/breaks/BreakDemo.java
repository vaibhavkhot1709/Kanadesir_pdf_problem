package com.breaks;

//58. Print 1 to 10 numbers on Screen But if value becomes 7 Loop must be Terminate.//

public class BreakDemo {
	public static void main(String[] args)
	{
		BreakDemo vb= new BreakDemo();
		 vb.breakDdemo();
	}
	
	public void breakDdemo()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			if(i==6)
			{
				
				break;
			}
			System.out.println("even numbers "+i);
		}
	}

}
