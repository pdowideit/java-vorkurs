package b12.a03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestGeradeZahl {
	@Test
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
