import javax.swing.JOptionPane;

public class LastSummer {
	public static void main(String[] args) {
		String Ans = JOptionPane.showInputDialog("What is your name?");
		String A = JOptionPane.showInputDialog("What did you do last summer?");
		JOptionPane.showMessageDialog(null, "I know that you " + A + " last summer, " + Ans + ". Muhahaha!");
	}
}
