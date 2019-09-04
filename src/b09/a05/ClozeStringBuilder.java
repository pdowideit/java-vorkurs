package b09.a05;

public class ClozeStringBuilder {
	
	public static void main(String[] args) {
		System.out.println(clozeString("abcdefghijklmnopwqrstuvwxyz"));
	}
	public static String clozeString(String s) {
		String cloze = "";
		for (int i = 0; i <= s.length() - 1; i++) {
			if(! ((i+1)%4==0)) {
				cloze+=s.toCharArray()[i];
			}
			else {
				cloze+=" ";
			}
		}
		return cloze;
	}
}
