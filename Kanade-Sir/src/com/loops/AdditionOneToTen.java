package com.loops;

public class AdditionOneToTen {
	public static void main(String[] args) {
		addition();
	}
	
	public static void addition(){
		
		int i, add=0;
		for(i=1;i<=10;i++) {
			
			add=add+i;
		}
		System.out.println(" addition = "+add);
	}
}

