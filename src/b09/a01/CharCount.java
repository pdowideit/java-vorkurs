package b09.a01;

public class CharCount {
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
