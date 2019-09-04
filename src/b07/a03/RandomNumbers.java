package b07.a03;

public class RandomNumbers {
	public static void main(String[] args) {
		int c = 0;
		for (int i = 1; i <= 100; i++) {
			c++;
			System.out.println(Math.random() * 100);
		}
		System.out.println(c + " Zufallszahlen gezogen");
		
	}
}
