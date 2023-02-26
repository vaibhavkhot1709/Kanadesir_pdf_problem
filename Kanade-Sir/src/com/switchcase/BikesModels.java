package com.switchcase;

/*24. Display list of different models of Bike’s. 
By selecting model no. 
Your program must be display information about that model.*/


import java.util.Scanner;

public class BikesModels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bikeModels();
	}

	private static void bikeModels() {
		// TODO Auto-generated method stub
		
		Scanner in= new Scanner(System.in);
		System.out.println("entre model number");
		
		int mnum=in.nextInt();
		
		switch (mnum) {
		
		case 1:
			System.out.println("Yamaha 150 cc buike with price rs 70500/-");
			break;
			
		case 2:
			System.out.println("Yamaha 180 cc bike with price rs 75000/-");
			break;
			
		case 3:
			System.out.println("Yamaha 200cc bike with price rs 80000/-");
			break;
			
		case 4:
			System.out.println("Yamaha 220 cc bike with price rs 90000/-");
			break;
			
		case 5:
			System.out.println("Yamaha 250 cc bike with price rs 110000/-");
			break;
		}
	}

}
