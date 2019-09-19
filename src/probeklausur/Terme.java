package probeklausur;

public class Terme {
	
	public static void main(String[] args) {
		System.out.println(werteAus(1, '-', 2, '*', 3));
	}
	public static double werteAus(double d1, char c1, double d2, char c2, double d3) {
		if(c1 == '-') {
			c1 = '+';
			d2 *= -1;
		}
		
		if(c2 == '-') {
			c2 = '+';
			d3 *= -1;
		}
		
		if ((c1 == '+' || c1 == '-') && (c2 == '*' || c2 == '/')) {
			// swap chars
			char tempC = c2;
			c2 = c1;
			c1 = tempC;

			// swap doubles
			double tempD = d1;
			d1 = d2;
			d2 = d3;
			d3 = tempD;
		}

		double res = 0;
		switch (c1) {
		case '+':
			res = d1 + d2;
			break;
		case '-':
			res = d1 - d2;
			break;
		case '*':
			res = d1 * d2;
			break;
		case '/':
			res = d1 / d2;
			break;
		}
		
		switch (c2) {
		case '+':
			res += d3;
			break;
		case '-':
			res -= d3;
			break;
		case '*':
			res *= d3;
			break;
		case '/':
			res /= d3;
			break;
		}
		
		return res;

	}
}
