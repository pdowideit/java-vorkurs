package b3;

public class Aufgabe2 {
	public static void main(String[] args) {
		System.out.println(Aufgabe2.getWaitingTime(2, 25));
		System.out.println(Aufgabe2.getWaitingTime(0, 25));
		System.out.println(Aufgabe2.getWaitingTime(2, 45));
		System.out.println(Aufgabe2.getWaitingTime(0, 45));
		System.out.println(Aufgabe2.getWaitingTime(0, 30));
	}
	
	public static int getWaitingTime(int h, int min) {
		
		return (30 - min % 30) % 30;
	}
}
