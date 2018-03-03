import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		String num = JOptionPane.showInputDialog("Choose a whole number");
		int n = Integer.parseInt(num);

		boolean isPrime = true;
		if (n == 1) {
			JOptionPane.showMessageDialog(null, "1 is not a prime number.");
			isPrime=false;
		} else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					JOptionPane.showMessageDialog(null, n + " is not a prime number.");
					isPrime = false;
					break;
				}
			}
		}
		if (isPrime) {
			JOptionPane.showMessageDialog(null, n + " is a prime number.");
		}
	}
}
