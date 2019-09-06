package b12.a06;

public class Dominostein {
	int top, bottom;

	public Dominostein(Dominostein d) throws NoDominoNumberException {
		new Dominostein(d.top, d.bottom);
	}

	public Dominostein(int top, int bottom) throws NoDominoNumberException {
		if (0 <= top && top <= 6) {
			if (0 <= bottom && bottom <= 6) {
				this.bottom = bottom;
				this.top = top;
				return;
			} else {
				throw new NoDominoNumberException(bottom);
			}
		} else {
			throw new NoDominoNumberException(top);
		}
	}

	public void dreheUm() {
		int temp = bottom;
		bottom = top;
		top = temp;
	}

	public int[] getValues() {
		return new int[] { top, bottom };
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) throws NoDominoNumberException {
		if (0 <= top && top <= 6) {
			this.top = top;
		} else {
			throw new NoDominoNumberException(top);
		}
	}

	public int getBottom() {
		return bottom;
	}

	public void setBottom(int bottom) throws NoDominoNumberException {
		if (0 <= bottom && bottom <= 6) {
			this.bottom = bottom;
		} else {
			throw new NoDominoNumberException(top);
		}
	}

	public void test() {
	}

}
