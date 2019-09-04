package b9;

public class Aufgabe4 {
	
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
