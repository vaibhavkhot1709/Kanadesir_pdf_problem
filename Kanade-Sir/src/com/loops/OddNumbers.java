package com.loops;

//27. Display 1, 3, 5, 7…., 99 (Odd Numbers).//

public class OddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oddNumber();

	}

	private static void oddNumber() {
		System.out.println("Odd numbers from 1 to 100 are ");
		for(int i=1;i<=100;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
			
		}
	}

}
