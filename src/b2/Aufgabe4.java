package b2;

public class Aufgabe4 {
	public static void main(String[] args) {
		System.out.println(Aufgabe4.getDistance(0, 0, 2, 0)); // Distance((0,0),(2,0)) = 2
	}
	 
	public static double getDistance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
	}
}
