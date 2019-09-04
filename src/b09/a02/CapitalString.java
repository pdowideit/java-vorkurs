package b09.a02;

import java.util.Scanner;

public class CapitalString {
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
