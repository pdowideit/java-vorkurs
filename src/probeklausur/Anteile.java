package probeklausur;

import java.util.Arrays;

public class Anteile {
	public static void main(String[] args) {
		int[] a = {2,2};
		int[] b = {5,5,5,5};
		int[] c = {-1,1,2};

		System.out.println(Arrays.toString(berechneAnteile(a)));
		System.out.println(Arrays.toString(berechneAnteile(b)));
		System.out.println(Arrays.toString(berechneAnteile(c)));
	}
	
	public static double[] berechneAnteile(int[] vals) {
		double sum = 0;
		for(int val : vals) {
			if(val < 0) throw new RuntimeException();
			sum += val;
		}
		
		double[] res = new double[vals.length];
		for (int i = 0; i < vals.length; i++) {
			res[i] = vals[i] / sum;
		}
		
		return res;
		
	}
}
