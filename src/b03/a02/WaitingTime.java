package b03.a02;

public class WaitingTime {
	public static void main(String[] args) {
		System.out.println(WaitingTime.getWaitingTime(2, 25));
		System.out.println(WaitingTime.getWaitingTime(0, 25));
		System.out.println(WaitingTime.getWaitingTime(2, 45));
		System.out.println(WaitingTime.getWaitingTime(0, 45));
		System.out.println(WaitingTime.getWaitingTime(0, 30));
	}
	
	public static int getWaitingTime(int h, int min) {
		
		return (30 - min % 30) % 30;
	}
}
