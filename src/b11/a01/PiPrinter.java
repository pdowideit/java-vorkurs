package b11.a01;

public class PiPrinter {
	public static void main(String[] args) {
		printPi(5);
		printPi(10);
		printPi(1);
	}
	public static void printPi(int decimals) {
		double pi = Math.PI;
		
		System.out.printf("PI: %."+decimals+"f\n", pi);
	}
}
