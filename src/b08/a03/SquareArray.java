package b08.a03;

public class SquareArray {
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
