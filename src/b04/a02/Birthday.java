package b04.a02;

public class Birthday {
	static double days = 365;
	
	public static void main(String[] args) {
		System.out.println(Birthday.doubleBirthday(2));
		System.out.println(Birthday.doubleBirthday(5));
		System.out.println(Birthday.doubleBirthday(10));
		System.out.println(Birthday.doubleBirthday(100));
		System.out.println(Birthday.doubleBirthday(200));
		System.out.println(Birthday.doubleBirthday(500));
		System.out.println(Birthday.doubleBirthday(1000));
	}
	
	public static double doubleBirthday(int size) {
		if(size<1) throw new ArithmeticException("Größe kleiner als 1 gegeben!");
		
		double start = days - size + 1;
		
		double prod = doubleBirthdayProd(start);
		return 1 - prod;
	}
	
	private static double doubleBirthdayProd(double n) {
		if(n == days) {
			return 1.0;
		}
		
		return doubleBirthdayProd(n+1) * (n / days);
	}
}
