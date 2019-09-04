package b8;

public class Aufgabe4 {
	static String[] monthNames = {"Januar","Februar","März","April","Mai",
			"Juni","Juli","August","September","Oktober","November","Dezember"};
	
	public static String getNameOfMonth(int no) {
		if(no < 1 || no > 12) throw new ArithmeticException();
		
		return monthNames[no-1];
	}
}
