package b09.a03;

public class AsciiTable {
	public static void main(String[] args) {
		showAsciiTable();
	}
	public static void showAsciiTable() {
		for(int i = 0; i <= 127; i++) {
			System.out.println("ASCII["+i+"]="+ (char)i);
		}
	}
}
