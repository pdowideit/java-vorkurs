package b09.a08;

import java.util.Arrays;

public class DigitCount {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(getDigitCount(1234567890)));
	}
	public static int[] getDigitCount(int n) {
		int[] digits = {0,0,0,0,0,0,0,0,0,0};
		
		while(n != 0) {
			digits[n%10] = digits[n%10] + 1;
			n/=10;
		}
		
		return digits;
	}
}
