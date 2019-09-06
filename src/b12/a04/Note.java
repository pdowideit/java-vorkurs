package b12.a04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Note {
	private static List<Double> noten = new ArrayList<Double>(
			Arrays.asList(1.0, 1.3, 1.7, 2.0, 2.3, 2.7, 3.0, 3.3, 3.7, 4.0, 5.0));

	private double note;

	public Note(Note n) throws NoNoteException {
		this(n.note);
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

	
}
