package b9;

import java.util.Scanner;

public class Aufgabe2 {
	public static void main(String[] args) {
		System.out.println(getCapitalString());
	}
	
	public static String getCapitalString() {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		sc.close();
		
		return s.toUpperCase();
	}
}
