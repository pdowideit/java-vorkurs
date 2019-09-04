package b8;

import java.util.Arrays;

public class Aufgabe5 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 6, 7, 8, 9, 10 };

		System.out.println(Arrays.toString(concat(a, b)));
	}

	public static int[] concat(int[] x1, int[] x2) {
		int len1 = x1.length;
		int len2 = x2.length;
		
		int[] result = new int[len1 + len2];
		
		System.arraycopy(x1, 0, result, 0, len1);
		System.arraycopy(x2, 0, result, len1, len2);
		
		return result;
	}
}
