package probeklausur;

public class CommonElements {
	public static void main(String[] args) {
		int[][] a = buildRandom2DimIntArray(1000, 1000);
		int[][] b = buildRandom2DimIntArray(10000, 10000);
		
		System.out.println(getBiggestCommonElement(a, b));
	}
	
	public static int[][] buildRandom2DimIntArray(int x, int y){
		int[][] res = new int[x][y];
		
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				res[i][j] = (int) (Math.random() * 100000);
			}
		}
		
		return res;
	}
	
	public static int getBiggestCommonElement(int [][] a, int[][]b) {
		int biggestCommon = Integer.MIN_VALUE;
		for(int[] aRow : a) {
			for(int aVal : aRow) {
				
				if(aVal < biggestCommon)
					break;
				
				for(int[] bRow : b) {
					for(int bVal : bRow) {
						
						if(bVal < biggestCommon)
							break;
						
						if(bVal == aVal && aVal > biggestCommon) {
							biggestCommon = aVal;
						}
					}
				}
			}
		}
		return biggestCommon;
	}
}
