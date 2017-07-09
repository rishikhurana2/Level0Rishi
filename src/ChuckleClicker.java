import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker {
  public static void main(String[] args) {
	makeButtons();
  }
  static void makeButtons(){
	 JFrame Chuckle = new JFrame();
	 Chuckle.setVisible(true);
	 JPanel panel = new JPanel();
	 Chuckle.add(panel);
	 JButton button1 = new JButton();
	 panel.add(button1);
	 button1.setText("Click here");
	 JButton button2 = new JButton();
	 panel.add(button2);
	 button2.setText("Or click here");
	 
  }
}
