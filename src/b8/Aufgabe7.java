package b8;

public class Aufgabe7 {
	public static void main(String[] args) {
		double[][] matrix = Aufgabe6.getIndexSumArray(15, 15);

		double trace = getTrace(matrix);

		System.out.println(trace);
	}

	public static double getTrace(double[][] matrix) {
		double trace = 0;
		for (int i = 0; i < matrix.length; i++) {
			try {
				trace += matrix[i][i];
			} catch (ArrayIndexOutOfBoundsException e) {
				break;
			}
		}

		return trace;
	}
}
