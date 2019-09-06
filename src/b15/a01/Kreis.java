package b15.a01;

import b12.a01.Punkt;

public class Kreis {
	private double radius;
	private Punkt mittelpunkt;
	
	public Kreis(double radius, Punkt mittelpunkt) {
		this.radius = radius;
		this.mittelpunkt = mittelpunkt;
	}
	
	public Kreis(Kreis k) {
		this(k.radius,k.mittelpunkt);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Punkt getMittelpunkt() {
		return mittelpunkt;
	}

	public void setMittelpunkt(Punkt mittelpunkt) {
		this.mittelpunkt = mittelpunkt;
	}
	
	public double getFlaeche() {
		return Math.PI * Math.pow(radius,2);
	}
	
	public double getUmfang() {
		return Math.PI * 2 * radius;
	}
	
	public double getAbstand(Punkt p) {
		return p.getDistance(mittelpunkt) - radius;
	}
}
