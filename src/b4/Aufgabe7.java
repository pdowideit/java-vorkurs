package b4;

public class Aufgabe7 {
	public static void main(String[] args) {
		System.out.println(getFibonacciNumber(1));
		System.out.println(getFibonacciNumber(2));
		System.out.println(getFibonacciNumber(3));
		System.out.println(getFibonacciNumber(4));
		System.out.println(getFibonacciNumber(5));
		System.out.println(getFibonacciNumber(6));
	}
	
	public static int getFibonacciNumber(int n) {
		if (n < 1) {
			throw new ArithmeticException();
		}
		
		int num = 1;
		int lastNum = 0;

		int idx = 1;

		while (idx < n) {
			int temp = lastNum;
			lastNum = num;
			num += temp;
			
			idx++;
		}

		return num;
	}
}
