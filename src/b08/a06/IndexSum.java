package b08.a06;

import java.util.Arrays;

public class IndexSum {
	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(getIndexSumArrayInt(10, 10)));
	}
	
	public static double[][] getIndexSumArrayDouble(int a, int b){
		double[][] field = new double[a][b];
		
		for(int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {
				field[i][j] = i + j;
			}
		}
		
		return field;
	}
	
	public static int[][] getIndexSumArrayInt(int a, int b){
		int[][] field = new int[a][b];
		
		for(int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {
				field[i][j] = i + j;
			}
		}
		
		return field;
	}
}
