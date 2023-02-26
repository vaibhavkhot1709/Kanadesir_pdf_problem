package com.Object_passing;

class Litter1 {
	int litter;
	double ml;

	public void get() {
		litter = 6;
		ml = 800;
	}

	public void show() {
		System.out.println(" qyuantity in litter  " + litter);
		System.out.println(" quantity in ml " + ml);
	}

	public void get1() {
		litter = 12;
		ml = 900;
	}

	public void addition(Litter1 d, Litter1 b) {
		litter = d.litter + b.litter;
		ml = d.ml + b.ml;

		if (ml > 1000) {
			litter += ml / 1000;
			ml %= 1000;
		}
	}
}

public class Litterml {
	public static void main(String[] args) {
		System.out.println("by first object");
		Litter1 d = new Litter1();
		d.get();
		d.show();

		System.out.println("\n\nby second object");
		Litter1 b = new Litter1();
		b.get1();
		b.show();

		System.out.println("\n\n by third object");
		Litter1 c = new Litter1();
		c.addition(d,b);
		c.show();
	}
}
