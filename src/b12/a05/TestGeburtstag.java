package b12.a05;

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
		
		try {
			g = new Geburtstag("JAN", 35);
			assert false;
		} catch (NoDayOfMonthException e) {
			assert true;
		} catch (NoMonthException e) {
			assert false;
		}
		
		try {
			g = new Geburtstag("ABC", 12);
			assert false;
		} catch (NoDayOfMonthException e) {
			assert false;
		} catch (NoMonthException e) {
			assert true;
		}
	}

}
