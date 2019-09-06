package b12.a06;

import org.junit.jupiter.api.Test;


public class TestDominostein {
	@Test
	public void test() {
		Dominostein d;
		
		try {
			d = new Dominostein(0, 1);
			assert d.getRechts() == 1 && d.getLinks() == 0;
		
			d.dreheUm();
			assert d.getRechts() == 0 && d.getLinks() == 1;
			
			Dominostein d2 = new Dominostein(d);
			assert d2.getRechts() == 0 && d2.getLinks() == 1;
		} catch (NoDominoNumberException e) {
			assert false;
		}
		
		try {
			d = new Dominostein(10,100);
			assert false;
		}catch (NoDominoNumberException e) {
			assert true;
		}
		
	}

}
