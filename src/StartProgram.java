import javax.swing.JFrame;

import model.PizzaOrderHelper;
import view.PizzaPanel;

/**
 * Sabina Johnson - skaramuja CIS171 20517 WW1 Apr 28, 2022
 */
public class StartProgram {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Pizza Order");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PizzaPanel panel = new PizzaPanel(new PizzaOrderHelper());
		frame.add(panel);
		frame.setSize(800, 800);
		frame.setVisible(true);
	}
}
