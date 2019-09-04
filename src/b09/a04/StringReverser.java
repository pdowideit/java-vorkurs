package b09.a04;

public class StringReverser {
	
	public static void main(String[] args) {
		System.out.println(reverse("abcdefg"));
	}
	
	public static String reverse(String s) {
		String rev = "";
		for(int i = s.length()-1;i>=0;i--) {
			rev+=s.toCharArray()[i];
		}
		return rev;
	}
}
