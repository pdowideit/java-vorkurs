package b12.a06;

public class NoDominoNumberException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3661403654946717047L;

	public NoDominoNumberException(int number) {
		super(number + " ist keine Zahl auf Dominosteinen");
	}
	
}
