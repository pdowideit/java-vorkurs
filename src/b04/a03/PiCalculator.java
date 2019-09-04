package b04.a03;

public class PiCalculator {
	public static void main(String[] args) {
//		System.out.println("Test");
		System.out.println(getPi(1000));
		System.out.println(getPi(2000));
		System.out.println(getPi(3000));
		System.out.println(getPi(4000));
		System.out.println(getPi(5000));
		System.out.println(getPi(10000));
		System.out.println(getPi(15000));
	}

	public static double getPi(int n) {
		if (n < 1)
			throw new ArithmeticException();
		
		return 4 * getPiSumRec(n - 1, 1, true);
	}

	private static double getPiSumRec(int n, int curr, boolean add) {
		double val = (add ? 1 : -1) * (1.0 / curr);
		
		if (n == curr)
			return val;

		return val + getPiSumRec(n, curr + 2, !add);
	}
}
