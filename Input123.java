import javax.swing.JOptionPane;

public class Input123 {

	public static void main(String[] args) {
		int input = 0;
		while (input != 4) {
			input = Integer.parseInt(JOptionPane.showInputDialog("enter a number from 1-3 or 4: quit"));
			if (input >= 4) {
				JOptionPane.showMessageDialog(null, "error message");
			} else {
				JOptionPane.showMessageDialog(null, "Good Job");
			}
		}

	}

}
