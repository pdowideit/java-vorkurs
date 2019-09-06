package b15;

import java.util.ArrayList;
import java.util.List;

public class Schachstellung {
	private Figur[][] schachfeld = new Figur[8][8];

	enum Figur {
		K, D, T, S, L, B, k, d, t, s, l, b, None;
		public String toString() {
			switch (this) {
			case None:
				return " ";

			default:
				return super.toString();
			}
		};
	}

	public Schachstellung() {
		for (int i = 0; i < schachfeld.length; i++) {
			for (int j = 0; j < schachfeld[i].length; j++) {
				schachfeld[i][j] = Figur.None;
			}
		}
	}

	public void setzeSchachstellung(String s) throws IllegalArgumentException {
		List<String> exceptionTexts = new ArrayList<String>();

		while (!s.equals("")) {
			String stellung = s.substring(0, 3);
			s = s.substring(3);

			String fig = "" + stellung.charAt(0);

			int zeile = Integer.parseInt("" + stellung.charAt(1)) - 1;
			int spalte = Integer.parseInt("" + stellung.charAt(2)) - 1;

			if (0 <= zeile && zeile < 8 && 0 <= spalte && spalte < 8) {
				boolean exists = false;
				for (Figur f : Figur.values()) {
					if (f.toString().equals(fig))
						exists = true;
				}

				if (exists) {
					if (schachfeld[zeile][spalte] == Figur.None) {
						schachfeld[zeile][spalte] = Figur.valueOf(fig);
					} else {
						exceptionTexts.add("Feld [" + zeile + "," + spalte + "] ist schon besetzt.");
					}
				} else {
					exceptionTexts.add("Figur " + fig + " existiert nicht.");
				}
			} else {
				exceptionTexts.add("Feld [" + zeile + "," + spalte + "] nicht auf dem Brett.");
			}
		}

		if (!exceptionTexts.isEmpty()) {
			String exc = "\n";

			for (String e : exceptionTexts)
				exc += e + "\n";

			throw new IllegalArgumentException(exc);
		}
	}

	public static void main(String[] args) {
		Schachstellung ss = new Schachstellung();
		try {
			ss.setzeSchachstellung("b22K24l28B23k66T99F12");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		System.out.println(ss);
	}

	@Override
	public String toString() {
		String ret = "";
		for (Figur[] zeile : schachfeld) {
			ret += "+---+---+---+---+---+---+---+---+\n|";
			for (Figur f : zeile) {
				ret += " " + f.toString() + " |";
			}
			ret += "\n";
		}
		ret += "+---+---+---+---+---+---+---+---+";

		return ret;
	}
}
