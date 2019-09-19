package probeklausur;

public class Code {

	public static void main(String[] args) {
		String a = "--..--.."; // -2.2-2.2

		System.out.println(code(a));
		System.out.println(code2(a));
	}

	public static String code(String s) {
		String res = "";

		while (s.length() > 0) {
			int count = 1;
			char c = s.charAt(0);
			s = s.substring(1);

			while (s.length() > 0 && s.charAt(0) == c) {
				count++;
				s = s.substring(1);
			}

			res += c + "" + count;
		}

		return res;
	}

	public static String code2(String s) {
		String res = "";
		int count = 0;
		int i = 0;
		while (i < s.length()) {
			count = 0;
			char c = s.charAt(i);

			while (i < s.length() && s.charAt(i) == c) {
				count++;
				i++;
			}

			res += c + "" + count;
		}

		return res;
	}
}
