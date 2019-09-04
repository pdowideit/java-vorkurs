package b6;

public class Aufgabe2 {
	
	public static void main(String[] args) {
		printRightAngledTriangle(5);
		printCenteredTriangle(5);
	}
	
	public static void printRightAngledTriangle(int height) {
		for(int i = 1; i <= height; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(i);	
			}
			System.out.println();
		}
	}
	
	public static void printCenteredTriangle(int height) {
		for(int i = 1; i <= height; i++) {
			StringBuilder sb = new StringBuilder();
			int space_count = height - i;
			
			for (int j = 0; j < space_count; j++) {
				sb.append(" ");
			}
			
			for (int j = 0; j < i; j++) {
				sb.append(i);
				sb.append(" ");
			}
			
			for (int j = 0; j < space_count; j++) {
				sb.append(" ");
			}
			System.out.println(sb.toString());
		}
	}
}
