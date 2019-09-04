package b8;

public class Aufgabe3 {
	public static boolean isSquare(int[][] test) {
		int width = test.length;
		
		for(int[] column : test) {
			if(column.length != width) {
				return false;
			}
		}
		
		return true;
	}
}
