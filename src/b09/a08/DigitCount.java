package b09.a08;

import java.util.Arrays;

public class DigitCount {
	public int a = 1;

	public static void main(String[] args) {
		int a = 0;
		int[] digitCount = getDigitCount(a);

		System.out.println(Arrays.toString(digitCount));
	}

	public static int[] getDigitCount(int n) {
		int[] digits = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		do {
			digits[n % 10] = digits[n % 10] + 1;
			n /= 10;
		} while (n != 0);

		return digits;
	}
}
