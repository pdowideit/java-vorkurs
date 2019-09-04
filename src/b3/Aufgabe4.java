package b3;

public class Aufgabe4 {
	public static int getPostage(int order) {
		if(order < 10000) {
			return 550;
		}
		else if(10000 <= order && order < 20000) {
			return 300;
		}
		else {
			return 0;
		}
	}
}
