package b9;

public class Aufgabe1 {
	public static int getCharCount(String s, char c) {
		int count = 0;
		for(char ch : s.toCharArray()) {
			if(c == ch) {
				count++;
			}
		}
		return count;
	}
}
