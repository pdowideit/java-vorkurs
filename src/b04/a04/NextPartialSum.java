package b04.a04;

public class NextPartialSum {
	public static void main(String[] args) {
		System.out.println(NextPartialSum.getNextPartialSum(5));
		System.out.println(NextPartialSum.getNextPartialSum(6));
		System.out.println(NextPartialSum.getNextPartialSum(7));
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
