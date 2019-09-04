package b04.a01;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(Factorial.getFactorial(4)); // fac(4)=4*3*2*1=24
		System.out.println(Factorial.getFactorial(7)); // fac(7)=5040
		System.out.println(Factorial.getFactorial(10)); // fac(10)=3628800
	}
	
	public static int getFactorial(int x) {
		if(x==1) return 1;
		
		return x * Factorial.getFactorial(x-1);
	}
}
