package b04.a06;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AsciiConverter {
	public static void main(String[] args) {
		int value = -1;
		while(value!=0) {
			JFrame frame = new JFrame("Zahl zu ASCII");
			
			value = Integer.parseInt(JOptionPane.showInputDialog(frame, "Geben Sie eine Ganzzahl zwischen 0 und 127 ein:"));
			if(value!=0)
				JOptionPane.showMessageDialog(frame, fromAscii(value));
		}
	}
	
	public static String fromAscii(int a) {
		return String.valueOf((char) a);
	}
}
