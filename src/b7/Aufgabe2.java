package b7;

public class Aufgabe2 {
	public static void main(String[] args) {
		Bruch b = new Bruch(1, 3);

		Bruch alias = b;
		Bruch klon = new Bruch(b);

		if (b == alias) {
			System.out.println("object == alias");
		}
		if (b != klon) {
			System.out.println("object != klon");
		}
		if (b.equals(klon)) {
			System.out.println("object equals klon");
		}
		if (b.equals(alias)) {
			System.out.println("object equals alias");
		}
	}
}
