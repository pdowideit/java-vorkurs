package b12.a01;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Punkt {
	private int x;
	private int y;

	public Punkt(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Punkt(Punkt p) {
		new Punkt(p.x, p.y);
	}

	public void schiebe(double dx, double dy) {
		x += dx;
		y += dy;
	}

	@Override
	public String toString() {
		return "Punkt [x=" + x + ", y=" + y + "]";
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void test() {
		int x = 0;
		int y = 1;

		Punkt p = new Punkt(x, y);

		assertEquals(x, p.getX());
		assertEquals(y, p.getY());

		p.setX(x + 1);
		p.setY(y + 1);

		assertEquals(x + 1, p.getX());
		assertEquals(y + 1, p.getY());

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
}
