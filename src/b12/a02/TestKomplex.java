package b12.a02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestKomplex {
	@Test
	public void test() {
		double a = 1.0;
		double b = 2.0;

		Komplex k = new Komplex(a, b);

		assertEquals(a, k.getA());
		assertEquals(b, k.getB());

		k.setA(a + 1);
		k.setB(b + 1);

		assertEquals(a + 1, k.getA());
		assertEquals(b + 1, k.getB());

	}

}
