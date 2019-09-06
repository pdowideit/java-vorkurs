package b16.a01;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		double[] x = {1.,2.,3.0,6.,0.,-1.};
		
		System.out.println(Arrays.toString(selectionSort(x)));
 	}
	
	public static double[] selectionSort(double[] x) {
		for (int i = 0; i < x.length; i++) {
			int max = i;
			for (int j = i + 1; j < x.length; j++) {
				if(x[j] > x[max]) {
					max = j;
				}
			}
			double help = x[max];
			x[max] = x[i];
			x[i] = help;
		}
		return x;
	}
}
