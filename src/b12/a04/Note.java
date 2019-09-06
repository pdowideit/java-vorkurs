package b12.a04;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Note {
	private static List<Double> noten = new ArrayList<Double>(
			Arrays.asList(1.0, 1.3, 1.7, 2.0, 2.3, 2.7, 3.0, 3.3, 3.7, 4.0, 5.0));

	private double note;

	public Note(Note n) {
		try {
			new Note(n.note);
		} catch (NoNoteException e) {
			e.printStackTrace();
		}
	}

	public Note(double n) throws NoNoteException {
		if (noten.contains(n)) {
			this.note = n;
		} else {
			throw new NoNoteException();
		}
	}

	public boolean hatBestanden() {
		return note <= 4.0;
	}
	
	public double getNote() {
		return note;
	}

	public void setNote(double note) throws NoNoteException {
		if (noten.contains(note)) {
			this.note = note;
		} else {
			throw new NoNoteException();
		}
	}

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
			Note n = new Note(falscheNote);
			n.getNote();
			assert false;
		} catch (NoNoteException e) {
			assert true;
		}
	}

}
