package com.loops;

//29. Display 0, 5, 10, 15…, 100 Numbers.//

public class FiveTableNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fiveNumbersTable();
	}
	
	public static void fiveNumbersTable() {
		
		for(int i=0;i<=100;i++) {
			
			if(i%5==0) {
				System.out.println(i);
			}
		}
	}
}
