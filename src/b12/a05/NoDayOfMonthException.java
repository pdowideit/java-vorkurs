package b12.a05;

public class NoDayOfMonthException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -608822587122274795L;

	public NoDayOfMonthException(int day, String month) {
		super(day + " ist kein Tag im " + month);
	}
}

