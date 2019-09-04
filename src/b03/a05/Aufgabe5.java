package b03.a05;

public class Aufgabe5 {
	public static String getNameOfMonth(int nr) {
		switch(nr) {
			case 1: return "Januar";
			case 2: return "Februar";
			case 3: return "März";
			case 4: return "April";
			case 5: return "Mai";
			case 6: return "Juni";
			case 7: return "Juli";
			case 8: return "August";
			case 9: return "September";
			case 10: return "Oktober";
			case 11: return "November";
			case 12: return "Dezember";
		}
		
		throw new ArithmeticException("Kein Monat mit dieser Nummer.");
	}
}
