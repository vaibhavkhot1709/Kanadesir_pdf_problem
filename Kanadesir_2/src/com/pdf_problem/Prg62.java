package com.pdf_problem;

/* 63. Create an array having 5 elements store values into it & Perform following programs.
g. Find Value that have in between 80 & 90.
h. Accept a value & Search into an array & Display it is Present or Not also Position of value.
i. Search value into an array & Replace this value with 99.
j. Take New input value. Search any value into an array & Replace this value with New value.
k. Search value into an array & Delete this value.
*/
public class Prg62 {
	int num[] = { 1, 2, 3, 4, 5 };
	int num2[] = new int[num.length];
	int k = 0;
	int l = 0;

// a. Display all elements in Reverse order.
//	public void revarseArray() {
//		for (int i = num.length - 1; i >= 0; i--) {
//			num2[k] = num[i];
//			k++;
//		}
//		System.out.println("reverse array be like ");
//		System.out.println(Arrays.toString(num2));
//	}
//
//	b. Calculate Square of every element.
//	public void squareOfElement() {
//		for (int i = 0; i< num2.length; i++) {
//			num2[i] = num[i] * num[i];
//		}
//		System.out.println("\nsquare of every element be like ");
//		System.out.println(Arrays.toString(num2));
//
//	}

//	c. Calculate Cube of every element & store into Second array.
//	public void cubeOfElement() {
//		for (int i = 0; i< num2.length; i++) {
//			num2[i] = num[i] * num[i]*num[i];
//		}
//		System.out.println("\ncube of every element be like ");
//		System.out.println(Arrays.toString(num2));
//
//	}
//	d. Copy one array into another array.
//	public void copyOfArray() {
//		for (int i = 0; i< num2.length; i++) {
//			num2[i] = num[i];
//		}
//		System.out.println("\ncopy of array be like ");
//		System.out.println(Arrays.toString(num2));
//
//	}
//	e. Display negative & positive values.
//	public void negPotValue() {
//		int n[] = { -1, -2, 4, 6, 8, -9, 7 };
//		int num3[] = new int[n.length];
//		int num4[] = new int[n.length];
//		for (int i = 0; i < n.length; i++) {
//			if (n[i] < 0) {
//				num3[k] = n[i];
//				k++;
//			}
//			if (n[i] >= 0) {
//				num4[l] = n[i];
//				l++;
//			}
//		}
//		int numneg[] = new int[k];
//		for (int i = 0; i < k; i++)
//			numneg[i] = num3[i];
//		System.out.println("negative element of given arra n are");
//		System.out.println(Arrays.toString(numneg));

//		int numpos[] = new int[l];
//		for (int i = 0;i<l; i++) {
//			numpos[i] = num4[i];
//		}
//		System.out.println("positive element of given arra n are");
//		System.out.println(Arrays.toString(numpos));
//	}

//	f. Count negative & positive Numbers.
//	public void countNegPotValue() {
//		int n[] = { -1, -2, 4, 6, 8, -9, 7 };
//		int num3[] = new int[n.length];
//		int num4[] = new int[n.length];
//		for (int i = 0; i < n.length; i++) {
//			if (n[i] < 0) {
//				num3[k] = n[i];
//				k++;
//			}
//			if (n[i] >= 0) {
//				num4[l] = n[i];
//				l++;
//			}
//		}
//		System.out.println(" number of negative elements : "+k);
//		System.out.println(" number of positive elements : "+l);
//	}

//	g. Find Value that have in between 80 & 90.
//	public void valueBet() {
//		int z=0;
//		int m[] = { 20,81,89,30,50,70,88,95,87};
//		for(int i=0;i<m.length;i++) {
//			if(m[i]<90 && m[i]>80  ) {
//				m[z]=m[i];
//				z++;
//			}
//		}
//		System.out.println(Arrays.toString(m));
//	}

	public static void main(String arg[]) {
		Prg62 p = new Prg62();
//		p.revarseArray();
//		p.squareOfElement();
//		p.cubeOfElement();
//		p.copyOfArray();
//		p.negPotValue();
//		p.countNegPotValue();
//		p.valueBet();

	}

}
