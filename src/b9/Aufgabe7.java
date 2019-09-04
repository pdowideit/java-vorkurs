package b9;

public class Aufgabe7 {
	public static void main(String[] args) {
		System.out.println(newGermanOrthography("Scheibenkleister scheint falsch."));
	}
	
	public static String newGermanOrthography(String s) {
		return s.replaceAll("Sch", "Sh").replaceAll("sch", "sh");
	}
}
