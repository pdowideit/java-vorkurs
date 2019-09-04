package b4;

public class Aufgabe1 {
	public static void main(String[] args) {
		System.out.println(Aufgabe1.getFactorial(4)); // fac(4)=4*3*2*1=24
		System.out.println(Aufgabe1.getFactorial(7)); // fac(7)=5040
		System.out.println(Aufgabe1.getFactorial(10)); // fac(10)=3628800
	}
	
	public static int getFactorial(int x) {
		if(x==1) return 1;
		
		return x * Aufgabe1.getFactorial(x-1);
	}
}
