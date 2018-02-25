import javax.swing.JOptionPane;

public class KnockKnock {
	public static void main(String[] args) {
		String Ans = JOptionPane.showInputDialog("Knock, knock.");
		if (Ans.equals("Who's there?")) {
			String A = JOptionPane.showInputDialog("Atch.");
			if (A.equals("Atch who?")) {
				JOptionPane.showMessageDialog(null, "Bless you!");
			}
			else {
				JOptionPane.showMessageDialog(null, "Say 'Atch who?' next time.");
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Say 'Who's there?' next time.");
		}
	}
}
