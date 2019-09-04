package b03.a03;

public class LinearEquation {
	public static double solveLinearEquation(double a, double b) {
		if(a == 0) throw new ArithmeticException("Gleichung nicht lösbar!");
		double x = -b / a;
		return x;
	}
}
