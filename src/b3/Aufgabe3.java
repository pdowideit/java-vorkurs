package b3;

public class Aufgabe3 {
	public static double solveLinearEquation(double a, double b) {
		if(a == 0) throw new ArithmeticException("Gleichung nicht l�sbar!");
		double x = -b / a;
		return x;
	}
}
