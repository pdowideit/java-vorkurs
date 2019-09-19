package probeklausur;

public class Text {
	private String text;

	public static void main(String[] args) {
		Text t = new Text("abcabc");
		System.out.println(t.getPos('a', 0));
		System.out.println(t.getPos('a', 1));
//		System.out.println(t.getPos('a', 2));
	}

	public Text(String s) {
		this.text = s;
	}

	public int getPos(char c, int n) {
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == c) {
				if (n == 0) {
					return i;
				} else {
					n--;
				}
			}
		}
		throw new ArrayIndexOutOfBoundsException();
	}
}
