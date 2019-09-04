package b2;

public class Aufgabe5 {
	public static double getDoubleRandom(double min, double max) {
		double range = max - min;
		
		return Math.random() * range + min;
	}
	
	public static double getIntRandom(int min, int max) {
		int range = max - min;
		
		return Math.random() * range + min;
	}
}
