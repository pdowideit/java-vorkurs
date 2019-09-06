package b12.a02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Komplex {
	private double re, im;

	public Komplex(double a, double b) {
		this.re = a;
		this.im = b;
	}

	public Komplex(Komplex k) {
		new Komplex(k.re, k.im);
	}

	@Override
	public String toString() {
		return re + "+" + im + "*i";
	}

	public double getA() {
		return re;
	}

	public void setA(double a) {
		this.re = a;
	}

	public double getB() {
		return im;
	}

	public void setB(double b) {
		this.im = b;
	}

	public double getBetrag() {
		return Math.sqrt(Math.pow(re, 2) * Math.pow(im, 2));
	}
	
	public void konjugiertKomplex() {
		im *= -1;
	}
	
	public Komplex getKonjugiertKomplex() {
		Komplex copy = new Komplex(this);
		
		copy.konjugiertKomplex();
		
		return copy;
	}
	
	public void add(Komplex k) {
		this.re += k.re;
		this.im += k.im;
	}
	
	public void mult(Komplex k) {
		double oldRe = this.re;
		this.re = oldRe * k.re - this.im * k.im;
		this.im = oldRe * k.im - this.im * k.re;
	}
	
	@Test
	public void test() {
		double a = 1.0;
		double b = 2.0;

		Komplex k = new Komplex(a, b);

		assertEquals(a, k.getA());
		assertEquals(b, k.getB());

		k.setA(a + 1);
		k.setB(b + 1);

		assertEquals(a + 1, k.getA());
		assertEquals(b + 1, k.getB());

	}

}
