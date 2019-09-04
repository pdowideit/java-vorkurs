package b8;

public class Aufgabe2 {
	public static double getMinimum(double[] values) {
		double min = Double.NEGATIVE_INFINITY;

		for (double value : values) {
			min = (value < min) ? value : min;
		}

		return min;
	}

	public static double getMinimumIndex(double[] values) {
		double min = Double.NEGATIVE_INFINITY;
		double minIdx = -1;

		for (int i = 0; i < values.length; i++) {
			double value = values[i];
			if(value < min) {
				min = value;
				minIdx = i;
			}
		}

		return minIdx;
	}

}
