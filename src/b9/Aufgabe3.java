package b9;

public class Aufgabe3 {
	public static void main(String[] args) {
		showAsciiTable();
	}
	public static void showAsciiTable() {
		for(int i = 0; i <= 127; i++) {
			System.out.println("ASCII["+i+"]="+ (char)i);
		}
	}
}
