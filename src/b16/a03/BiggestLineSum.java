package b16.a03;

public class BiggestLineSum {
	public static void main(String[] args) {
		double[][] field = {{1,2,3},{1,2,2},{2,2},{9}};
		
		System.out.println(getBiggestLineSum(field));
	}
	
	
	public static double getBiggestLineSum(double[][] field){
		double sum = Double.MIN_VALUE;
		
		for(double[] line : field) {
			double lineSum = 0;
			for(double element : line) {
				lineSum += element;
			}
			sum = lineSum > sum ? lineSum : sum;
		}
		
		return sum;
	}
}
