package b02.a01;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ReciprocalNumber {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Reziproke Zahl");
		
		double value = Double.parseDouble(JOptionPane.showInputDialog(frame, "Geben Sie eine Zahl ein:"));
	
		double reciprocal = 1 / value;
		
		System.out.println("Zahl: " + value + ", Reziproke Zahl: " + reciprocal);
	}
}
