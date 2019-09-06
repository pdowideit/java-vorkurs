package b12.a05;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Geburtstag {
	private static String[] monthsArray = {"JAN","FEB","MAR","APR","MAI","JUN","JUL","AUG","SEP","OKT","NOV","DEZ"};
	private static List<String> months = Arrays.asList(monthsArray);
	private static Integer[] daysOfMonthArray = {31,29,31,30,31,30,31,31,30,31,30,31};
	private static Map<String,Integer> daysOfMonth = new HashMap<String,Integer>();
	
	private String month;
	private int day;
	
	public void init() {
		for(String month : months) {
			daysOfMonth.put(month, daysOfMonthArray[months.indexOf(month)]);
		}
	}
	
	public Geburtstag(Geburtstag g) throws NoDayOfMonthException, NoMonthException {
		new Geburtstag(g.month, g.day);
	}
	
	public Geburtstag(String month, int day) throws NoDayOfMonthException, NoMonthException {
		if(months.contains(month)) {
			if (daysOfMonth.get(month) >= day) {
				this.day = day;
				this.month = month;
			}
			else {
				throw new NoDayOfMonthException(day,month);
			}
		}
		else {
			throw new NoMonthException(month);
		}
	}

	@Override
	public String toString() {
		return "Geburtstag ["+day+"."+month+"]";
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) throws NoMonthException {
		if(months.contains(month)) {
			this.month = month;
		}
		else {
			throw new NoMonthException(month);
		}
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) throws NoDayOfMonthException {
		if(day <= daysOfMonth.get(month)) {
			this.day = day;
		}
		else {
			throw new NoDayOfMonthException(day, month);
		}
	}
	
	public void test() {
		init();
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + ((month == null) ? 0 : month.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Geburtstag other = (Geburtstag) obj;
		if (day != other.day)
			return false;
		if (month == null) {
			if (other.month != null)
				return false;
		} else if (!month.equals(other.month))
			return false;
		return true;
	}
	
	
	
	
	
}
