package b12.a06;

import java.util.Arrays;

public class Dominostein {
	private int links, rechts;

	public Dominostein(Dominostein d) throws NoDominoNumberException {
		this(d.links,d.rechts);
	}

	public void checkDominoNumber(int num) throws NoDominoNumberException {
		if(0 > num || num > 6) {
			throw new NoDominoNumberException(num);
		}
	}
	
	public Dominostein(int top, int bottom) throws NoDominoNumberException {
		checkDominoNumber(top);
		checkDominoNumber(bottom);
		
		this.links = top;
		this.rechts = bottom;
	}

	public void dreheUm() {
		int temp = rechts;
		rechts = links;
		links = temp;
	}

	public int[] getValues() {
		return new int[] { links, rechts };
	}

	public int getLinks() {
		return links;
	}

	public void setLinks(int links) throws NoDominoNumberException {
		if (0 <= links && links <= 6) {
			this.links = links;
		} else {
			throw new NoDominoNumberException(links);
		}
	}

	public int getRechts() {
		return rechts;
	}

	public void setRechts(int rechts) throws NoDominoNumberException {
		if (0 <= rechts && rechts <= 6) {
			this.rechts = rechts;
		} else {
			throw new NoDominoNumberException(links);
		}
	}
	
	@Override
	public String toString() {
		return Arrays.toString(getValues());
	}
}
