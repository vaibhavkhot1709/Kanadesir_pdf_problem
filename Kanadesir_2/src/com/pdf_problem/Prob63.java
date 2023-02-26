package com.pdf_problem;

import java.util.Arrays;

public class Prob63 {

//	Create an array having 5 elements store values into it & Perform 
//	following programs.

	public static void main(String arg[]) {

		int[] a = { 1, 2, -3, 4, 6, 9 };

//		System.out.println(Arrays.toString(a));
//========================================================

//		a. Display all elements in Reverse order
		int reverse[] = new int[a.length];
		int square[] = new int[a.length];
		int x = 0;

		for (int i = a.length - 1; i >= 0; i--) {
			reverse[x] = a[i];
			square[x] = a[i] * a[i];

			x++;
		}
		System.out.println("revere array is : " + Arrays.toString(reverse));

//========================================================
//		b. Calculate Square of every element.
		System.out.println("revere square array is : " + Arrays.toString(square));

//========================================================

//		d. Copy one array into another array.

		int[] copyarray = Arrays.copyOf(a, a.length);

		System.out.println("copy array " + Arrays.toString(copyarray));

//========================================================

//		e. Display negative & positive values.

		for (int i = 0; i < a.length; i++) {

			if (a[i] > 0)
				System.out.println("positive number from array is " + a[i]);
			else
				System.out.println("negative number from array is " + a[i]);

		}

//========================================================
//		f. Count negative & positive Numbers.

		int countpos = 0;
		int countneg = 0;
		for (int i = 0; i < a.length; i++) {

			if (a[i] > 0) {
				countpos++;
			} else {
				countneg++;
			}
		}
		System.out.println(" \n\n positive number from array is " + countpos);
		System.out.println("negative number from array is " + countneg);

	}

}
