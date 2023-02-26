package com.loops;

//28. Display 0, 2, 4, 6…., 100 (Even Numbers).//

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		evenNumbers();
	}

	private static void evenNumbers() {
		// TODO Auto-generated method stub
		
		System.out.println("Even numbers from 1 to 100 are ");
		
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				
				
				System.out.println(i);
			}
			
		}
	}

}
