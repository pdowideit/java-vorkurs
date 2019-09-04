package b09.a06;

import java.util.Arrays;
import java.util.Scanner;

public class Parameters {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(getParameters()));
	}
	public static int[] getParameters() {
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine();
		
		sc.close();
		
		line = line.replace(" ", "");
		
		String[] stringValues = line.split(",");
		
		int[] values = new int[stringValues.length];
		
		int i = 0;
		for(String stringValue : stringValues) {
			int value = Integer.parseInt(stringValue);
			values[i] = value;
			i++;
		}
		
		return values;
	}
}
