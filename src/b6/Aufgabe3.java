package b6;

public class Aufgabe3 {
	public static void main(String[] args) {
		printCircle(5);
		printCircle(50);
		printCircle(100);
	}

	public static void printCircle(int radius) {
		double dist;

		for (int i = 0; i <= 2 * radius; i++) {

			for (int j = 0; j <= 2 * radius; j++) {
				dist = Math.sqrt((i - radius) * (i - radius) + (j - radius) * (j - radius));

				if (dist > radius - 0.5 && dist < radius + 0.5)
					System.out.print("#");
				else
					System.out.print(" ");
			}

			System.out.print("\n");
		}
	}
}
