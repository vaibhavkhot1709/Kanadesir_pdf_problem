package com.pdf_problem;

//50. Display Fibonacci Series.
// 0, 1, 1, 2, 3, 5, 8, 13, 21, …….
public class Prob50 {
		public static void main(String[] args) {
			fibonacci();
		}
		
		public static void fibonacci() {
			int a=0;
			int b=1;
			int c;
			
			for(int i=1;i<=10;i++) {
				c=a+b;
				System.out.println(c);
				a=b;
				b=c;
			}
		}
}
