package com.breaks;

public class ContinueDemo {
	public static void main(String[] args) {
		continueDemo();
	}
	
	public static void continueDemo()
	{
		int i;
		int num=10;
		for(i=1;i<=num;i++)
		{
			if(i==8)
				break;
			System.out.println("result "+i);
		}
	}

}
