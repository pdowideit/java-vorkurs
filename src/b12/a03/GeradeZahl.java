package b12.a03;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeradeZahl {
	private int val;

	public GeradeZahl(int val) {
		val = val % 2 == 1 ? val - 1 : val;
		this.val = val;
	}

	public GeradeZahl(GeradeZahl gz) {
		new GeradeZahl(gz.val);
	}
	
	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		val = val % 2 == 1 ? val - 1 : val;
		this.val = val;
	}

	@Override
	public String toString() {
		return "GeradeZahl [val=" + val + "]";
	}
	
	public GeradeZahl getNachfolger() {
		return new GeradeZahl(this.val + 2);
	}
	
	public GeradeZahl getSum(GeradeZahl g) {
		return new GeradeZahl(val + g.val);
	}
	
	public GeradeZahl getProd(GeradeZahl g) {
		return new GeradeZahl(val * g.val);
	}
	
	public void test() {
		int squareVal = 2;
		int oddVal = squareVal + 1;
		
		// test behavior with square value
		GeradeZahl gz = new GeradeZahl(squareVal);
		
		assertEquals(squareVal, gz.getVal());
		
		gz.setVal(squareVal);
		
		assertEquals(squareVal, gz.getVal());
		
		// test behavior with odd value
		gz = new GeradeZahl(oddVal);
		
		assertEquals(squareVal, gz.getVal());
		
		gz.setVal(oddVal);

		assertEquals(squareVal, gz.getVal());
	}
	

}
