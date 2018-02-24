import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		String num = JOptionPane.showInputDialog("Choose a whole number");
		int n = Integer.parseInt(num);
		boolean isPrime( n) {
		    for(int i=2;i<n;i++) {
		        if(n%i==0)
		            return false;
		    }
		    return true;
		}
	}
}
	