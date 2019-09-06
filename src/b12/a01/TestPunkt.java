package b12.a01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestPunkt {
	
	@Test
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
}
