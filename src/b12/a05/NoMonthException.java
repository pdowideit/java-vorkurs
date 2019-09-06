package b12.a05;

public class NoMonthException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -733851967270367948L;
	public NoMonthException(String month) {
		super(month + " ist kein Monat");
	}
}
