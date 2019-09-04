package b7;

public class Aufgabe1 {
	public static void main(String[] args) {
		Bruch zehntel = new Bruch(1, 10);

		Bruch b = new Bruch(1, 100);
		Bruch gleicherNenner = new Bruch(b);
		gleicherNenner.add(zehntel);

		System.out.println(compareNenner(b, gleicherNenner));
		
		b = new Bruch(2, 10);
		Bruch hoehererNenner = new Bruch(b);
		hoehererNenner.add(zehntel);
		
		System.out.println(compareNenner(b, hoehererNenner));
		
		b = new Bruch(1, 10);
		Bruch niedrigererNenner = new Bruch(b);
		niedrigererNenner.add(zehntel);

		System.out.println(compareNenner(b, niedrigererNenner));

	}

	public static String compareNenner(Bruch a, Bruch b) {
		String literal = "";
		if (a.getNenner() > b.getNenner()) {
			literal = ">";
		} else if (a.getNenner() == b.getNenner()) {
			literal = "==";
		} else {
			literal = "<";
		}

		String compareText = a.getNenner() + literal + b.getNenner();

		return compareText;
	}
}
