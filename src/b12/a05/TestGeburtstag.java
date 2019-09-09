package b12.a05;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TestGeburtstag {
	
	@Test
	public void test() {
		Geburtstag.init();
		@SuppressWarnings("unused")
		Geburtstag g;
		try {
			g = new Geburtstag("JAN", 12);
			assert true;
		} catch (NoDayOfMonthException e) {
			assert false;
		} catch (NoMonthException e) {
			assert false;
		}
		
		// test exceptions
		assertThrows(NoDayOfMonthException.class, () -> new Geburtstag("JAN", 35));
		assertThrows(NoMonthException.class, () -> new Geburtstag("ABC", 12));
	}

}
