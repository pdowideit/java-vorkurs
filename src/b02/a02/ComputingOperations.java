package b02.a02;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ComputingOperations {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Reziproke Zahl");
		
		double value = Double.parseDouble(JOptionPane.showInputDialog(frame, "Geben Sie eine Zahl ein:"));
		double abs = Math.abs(value);
		double log = Math.log(value);
		double sinh = Math.sinh(value);

		System.out.println("Zahl: " + value);
		System.out.println("Absolutwert: " + abs);
		System.out.println("Logarithmus: " + log);
		System.out.println("Sinus Hyperbolikus: " + sinh);
	}
}
