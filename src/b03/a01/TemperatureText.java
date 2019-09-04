package b03.a01;

public class TemperatureText {
	public static String getTemperatureText(double temp) {
		if(temp <= 10) {
			return "kalt";
		}
		else if(10 < temp && temp <= 25) {
			return "lauwarm";
		}
		else if(25 < temp && temp <= 40) {
			return "warm";
		}
		else {
			return "heiß";
		}
	}
}
