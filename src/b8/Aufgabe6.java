package b8;

import java.util.Arrays;

public class Aufgabe6 {
	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(getIndexSumArray(10, 10)));
	}
	
	public static double[][] getIndexSumArray(int a, int b){
		double[][] field = new double[a][b];
		
		for(int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {
				field[i][j] = i + j + 1;
			}
		}
		
		return field;
	}
}
