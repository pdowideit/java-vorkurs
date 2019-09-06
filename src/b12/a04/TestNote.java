package b12.a04;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestNote {
	@Test
	public void test() {
		double note = 1.3;
		double falscheNote = 1.2;

		// test behavior with correct note

		try {
			Note n = new Note(note);
			assertEquals(note, n.getNote());
		} catch (NoNoteException e) {
			assert false;
		}

		// test behavior with wrong note
		try {
			@SuppressWarnings("unused")
			Note n = new Note(falscheNote);
			assert false;
		} catch (NoNoteException e) {
			assert true;
		}
	}

}
