package com.pdf_problem;
//24. Display list of different models of Bike’s. By selecting model no. 

//Your program must be display information about that model.

public class Prob24 {

	public static void main(String[] args) {
		bikeSwitchCase();
	}

	public static void bikeSwitchCase() {
int number = 12;
		
		switch (number)
		{
			case 6:
			System.out.println(" Honda Activa 6G. 71,805 | Scooters | 109.51 cc.");
			break;
			
			case 8:
			System.out.println(" TVS Ntorq 125. 82,592 | Scooters | 124.8 cc. ...");
			break;
			
			case 10:
			System.out.println(" Suzuki Access 125. 75,293 | Scooters | 124 cc. ");
			break;
			
			case 12:
			System.out.println(" TVS Jupiter. 70,993 | Scooters | 109.7 cc.");
			break;
			
			case 14:
			System.out.println(" Ather 450X. 1,40,060 | Scooters.");
			break;
			
			default:
			System.out.println("Yamaha Fascino 125. ...");
		}
	}	
}
