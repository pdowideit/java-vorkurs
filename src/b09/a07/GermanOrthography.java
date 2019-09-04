package b09.a07;

public class GermanOrthography {
	public static void main(String[] args) {
		System.out.println(newGermanOrthography("Scheibenkleister scheint falsch."));
	}
	
	public static String newGermanOrthography(String s) {
		return s.replaceAll("Sch", "Sh").replaceAll("sch", "sh");
	}
}
