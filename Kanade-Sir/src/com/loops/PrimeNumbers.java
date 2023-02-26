package com.loops;

public class PrimeNumbers {
	public static void main(String[] args) {
		PrimeNumbers in= new PrimeNumbers();
		in.ptimeNumbersFromThreeToHundread();
		
	}
	
	public final int ptimeNumbersFromThreeToHundread()
	{
		int i,j,c=0;
		for (i=1;i<=100;i++)
		{
			for(j=2;j<=i/2;j++) {
			if(i%j==0)
			c++;
			}
			if(c==0)
				System.out.println(i);
			c=0;
		}
		return i;
	}

}
