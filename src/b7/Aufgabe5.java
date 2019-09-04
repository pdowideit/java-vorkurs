package b7;

import java.awt.Point;
import java.util.Scanner;

public class Aufgabe5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Point1.x=");
		int x = Integer.parseInt((sc.nextLine()));
		System.out.print("Point1.y=");
		int y = Integer.parseInt((sc.nextLine()));
		
		Point p1 = new Point(x, y);
		
		System.out.print("Point2.x=");
		x = Integer.parseInt((sc.nextLine()));
		System.out.print("Point2.y=");
		y = Integer.parseInt((sc.nextLine()));
		
		Point p2 = new Point(x, y);
		
		sc.close();

		p1.translate(10, 10);
		p2.translate(10, 10);

		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		double dist = p1.distance(p2);
		System.out.println("Distance Point1->Point2=" + dist);
	}
}
