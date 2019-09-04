package b6;

public class Aufgabe1 {
	public static void main(String[] args) {
		System.out.println(gcd(12, 8));
		System.out.println(gcd(24, 9));
		System.out.println(gcd(100, 50));
	}

	public static int gcd(int a, int b) {
		if (a < 1 || b < 1) {
			throw new ArithmeticException();
		}

		while (b != 0) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}

		return a;
	}
}
