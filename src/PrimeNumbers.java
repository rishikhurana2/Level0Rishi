import javax.swing.JOptionPane;

public class PrimeNumbers {
  public static void main(String[] args) {
	String number;
	boolean prime = true;
	number = JOptionPane.showInputDialog("Give me a number, any number");
	int realNumber = Integer.parseInt(number);
	for (int i = 2; i < realNumber; i++) {
		if (realNumber%i == 0) {
			prime = false;
		}
	}
	if (prime) {
		JOptionPane.showMessageDialog(null, "It's a prime number");
	}
	if (!prime) {
		JOptionPane.showMessageDialog(null, "It's not a prime number");
	}
  }
}
