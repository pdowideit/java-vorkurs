package b2;

public class Aufgabe3 {

	public static void main(String[] args) {
		System.out.println(Aufgabe3.getFahrenheit(25.0)); // 25°C = 77°F
		System.out.println(Aufgabe3.getFahrenheit(15.0)); // 15°C = 59°F
		System.out.println(Aufgabe3.getFahrenheit(10)); // 10°C = 50°F
	}

	public static double getFahrenheit(double celsius) {
		return (celsius * 9.0 / 5.0) + 32;
	}
}
