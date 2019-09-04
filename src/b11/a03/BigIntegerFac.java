package b11.a03;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerFac {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String val = sc.nextLine();
		
		sc.close();
		
		System.out.println(fac(new BigInteger(val)));
	}
	
	static BigInteger fac(BigInteger n) {
		if(n.equals(new BigInteger("0")))
			return new BigInteger("1");
		
		return n.multiply(fac(n.add(new BigInteger("-1"))));
	}
}
