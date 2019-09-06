package b11.a02;

import b08.a06.IndexSum;

public class ArrayPrinter {
	public static void main(String[] args) {
		int[][] matrix = IndexSum.getIndexSumArrayInt(100, 100);
		printArray(matrix);
	}
	
	public static void printArray(int[][] matrix) {
		int maxLen = -1;
		for(int[] arr : matrix) {
			for(int val : arr) {
				int len = getIntLen(val);
				maxLen = maxLen < len ? len : maxLen;
			}
		}
		
		int width = maxLen + 1;
		
		for(int[] arr : matrix) {
			for(int val : arr) {
				System.out.printf("%"+width+"d", val);
			}
			System.out.println();
		}
	}
	
	private static int getIntLen(int val) {
		int i = 0;
		while(val > 0) {
			i++;
			val/=10;
		}
		return i;
	}
}
