package b12.a01;

public class Punkt {
	private int x;
	private int y;

	public Punkt(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Punkt(Punkt p) {
		this(p.x, p.y);
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

	public double getDistance(Punkt p) {
		return Math.sqrt(Math.pow(this.x - p.x, 2) * Math.pow(this.y - p.y, 2));
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
