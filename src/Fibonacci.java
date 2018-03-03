
public class Fibonacci {
	public static void main(String[] args) {
		int n = 1;
		int n1 = 0;
		int n2 = 0;
		for (int i = 0; i < 12; i++) {

			System.out.println(n);

			n1 = n2;
			n2 = n;
			n = n1 + n2;
		}
	}
}
