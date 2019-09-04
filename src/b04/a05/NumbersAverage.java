package b04.a05;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class NumbersAverage {
	static List<Integer> values = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		int num_count = 0;
		int avg = 0;
		int sum = 0;
		
		int value = -1;
		while(value != 0) {
			
			JFrame frame = new JFrame("Zahl");
			
			value = Integer.parseInt(JOptionPane.showInputDialog(frame, "Geben Sie eine Ganzzahl ein:"));
			
			if(value!=0)
				values.add(value);
			
			num_count++;
			sum += value;
			avg = sum / num_count;
		}

		System.out.println("Anzahl Werte: " + num_count);
		System.out.println("Summe Werte: " + sum);
		System.out.println("Durchschnitt Werte: " + avg);
		System.out.println("Werte: " + values.toString());
	}
}
