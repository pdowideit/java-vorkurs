package b12.a06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;


public class TestDominostein {
	@Test
	public void test() {
		Dominostein d;
		
		try {
			d = new Dominostein(0, 1);
			assertEquals(1, d.getRechts());
			assertEquals(0, d.getLinks());
			
			d.dreheUm();
			assertEquals(0, d.getRechts());
			assertEquals(1, d.getLinks());
			
			Dominostein d2 = new Dominostein(d);
			assertEquals(0, d2.getRechts());
			assertEquals(1, d2.getLinks());
		} catch (NoDominoNumberException e) {
			assert false;
		}
		
		assertThrows(NoDominoNumberException.class, () -> new Dominostein(10, 100));
	}

}
