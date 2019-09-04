package b4;

public class Aufgabe4 {
	public static void main(String[] args) {
		System.out.println(Aufgabe4.getNextPartialSum(5));
		System.out.println(Aufgabe4.getNextPartialSum(6));
		System.out.println(Aufgabe4.getNextPartialSum(7));
	}

	public static int getNextPartialSum(int v) {
		if (v < 1)
			throw new ArithmeticException();

		int i = 1;
		int res = 1;
		while (res <= v) {
			i++;
			res += i;
		}

		return res;
	}
}
