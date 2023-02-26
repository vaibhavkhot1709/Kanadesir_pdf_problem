package com.Object_passing;

class Distance1 {
	int distancekm;
	double distm;

	public void get() {
		distancekm = 5;
		distm = 400;

	}

	public void get1() {
		distancekm = 6;
		distm = 700;

	}

	public void show() {

		System.out.println("distance in km is : " + distancekm);
		System.out.println("distance in m is : " + distm);
	}

	public void addition(Distance1 x, Distance1 y) {
		distancekm = x.distancekm + y.distancekm;
		distm = x.distm + y.distm;

		if (distm > 1000) {
			distancekm += distm / 1000;
			distm %= 1000;
		}
	}

}

public class Distance {
	public static void main(String[] args) {

		System.out.println(" distance by object 1 d ");
		Distance1 d = new Distance1();
		d.get();
		d.show();

		System.out.println("\n distance by object 2 b");
		Distance1 b = new Distance1();
		b.get1();
		b.show();

		System.out.println("\n distance by object 3 z");
		Distance1 z = new Distance1();
		z.addition(d, b);
		z.show();
	}

}
