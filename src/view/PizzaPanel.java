package view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import model.Pizza;
import model.PizzaDrawing;
import model.PizzaOrderHelper;

/**
 * Sabina Johnson - skaramuja CIS171 20517 WW1 Apr 28, 2022
 */
public class PizzaPanel extends JPanel {
	PizzaOrderHelper pizzaOrderHelper;
	private String selectedTopping;
	private String selectedSize;
	private JLabel title = new JLabel("Complete The Order Form Below:");
	private JLabel name = new JLabel("First Name: ");
	private JTextField nameTextField = new JTextField(20);
	private JLabel size = new JLabel("Size: ");
	private JRadioButton smallButton = new JRadioButton("Small");
	private JRadioButton mediumButton = new JRadioButton("Medium");
	private JRadioButton largeButton = new JRadioButton("Large");
	private JRadioButton extraLargeButton = new JRadioButton("Extra Large");
	private JLabel topping = new JLabel("Topping: ");
	private JRadioButton cheeseButton = new JRadioButton("Cheese");
	private JRadioButton pepperoniButton = new JRadioButton("Pepperoni");
	private JRadioButton sausageButton = new JRadioButton("Sausage");
	private JLabel pizzaOrder = new JLabel("Pizza Order Details: ");
	private JTextArea pizzaOrderDetails = new JTextArea();
	private JButton addPizza = new JButton("Add");
	private JButton submit = new JButton("Submit");
	private JButton cancel = new JButton("Cancel");
	private PizzaDrawing pizzaDrawing = new PizzaDrawing();
	ButtonGroup sizeGroup = new ButtonGroup();
	ButtonGroup toppingGroup = new ButtonGroup();

	public PizzaPanel(PizzaOrderHelper pizzaOrderHelper) {
		super();

		// Set the pizza order helper
		this.pizzaOrderHelper = pizzaOrderHelper;

		// Chanage font and size of title text
		Font font1 = new Font("SansSerif", Font.BOLD, 20);
		title.setFont(font1);

		// Chanage font and size of labels
		Font font2 = new Font("SansSerif", Font.BOLD, 14);
		name.setFont(font2);
		size.setFont(font2);
		topping.setFont(font2);
		pizzaOrder.setFont(font2);

		// Group the radio buttons for Pizza size
		sizeGroup.add(smallButton);
		sizeGroup.add(mediumButton);
		sizeGroup.add(largeButton);
		sizeGroup.add(extraLargeButton);

		// Group the radio buttons for topping
		toppingGroup.add(cheeseButton);
		toppingGroup.add(pepperoniButton);
		toppingGroup.add(sausageButton);

		// create a new instance of the size click listener
		SizeGroupClickListener g = new SizeGroupClickListener();
		// adds the listener(s) to the size buttons
		smallButton.addActionListener(g);
		mediumButton.addActionListener(g);
		largeButton.addActionListener(g);
		extraLargeButton.addActionListener(g);

		// create a new instance of the topping click listener
		ToppingGroupClickListener t = new ToppingGroupClickListener();
		// adds the listener(s) to the topping buttons
		cheeseButton.addActionListener(t);
		pepperoniButton.addActionListener(t);
		sausageButton.addActionListener(t);

		// create a new instance of the submit click listener
		SubmitClickListener s = new SubmitClickListener();
		// adds the listener(s) to the submit button
		submit.addActionListener(s);

		// create a new instance of the cancel click listener
		CancelClickListener c = new CancelClickListener();
		// adds the listener(c) to the cancel button
		cancel.addActionListener(c);

		// create a new instance of the adding a pizza click listener
		AddPizzaClickListener a = new AddPizzaClickListener();
		// adds the listener(a) to the cancel button
		addPizza.addActionListener(a);

		pizzaOrderDetails.setEditable(false);
		pizzaOrderDetails.setLineWrap(true);
		pizzaDrawing.setPreferredSize(new Dimension(300, 300));

		// Implement GridLayout
		this.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();

		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = 5;
		add(title, constraints);

		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		add(name, constraints);

		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 1;
		constraints.gridy = 1;
		add(nameTextField, constraints);

		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 0;
		constraints.gridy = 2;
		add(size, constraints);

		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 1;
		constraints.gridy = 2;
		add(smallButton, constraints);

		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 2;
		constraints.gridy = 2;
		add(mediumButton, constraints);

		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 3;
		constraints.gridy = 2;
		add(largeButton, constraints);

		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 4;
		constraints.gridy = 2;
		add(extraLargeButton, constraints);

		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 0;
		constraints.gridy = 3;
		add(topping, constraints);

		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 1;
		constraints.gridy = 3;
		add(cheeseButton, constraints);

		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 2;
		constraints.gridy = 3;
		add(pepperoniButton, constraints);

		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 3;
		constraints.gridy = 3;
		add(sausageButton, constraints);

		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 0;
		constraints.gridy = 4;
		add(addPizza, constraints);

		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 2;
		constraints.gridy = 4;
		add(submit, constraints);

		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 4;
		constraints.gridy = 4;
		add(cancel, constraints);

		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 0;
		constraints.gridy = 6;
		add(pizzaOrder, constraints);

		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 0;
		constraints.gridy = 7;
		constraints.gridwidth = 5;
		add(pizzaOrderDetails, constraints);

		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 0;
		constraints.gridy = 8;
		constraints.gridwidth = 5;
		constraints.gridheight = 5;
		add(pizzaDrawing, constraints);

	}

	// ActionListetener for handling submitting the users pizza order
	class SubmitClickListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (pizzaOrderHelper.pizzas.size() > 0) {
				if (!nameTextField.getText().isBlank()) {
					pizzaOrderHelper.placeOrder();
					pizzaOrderDetails
							.setText("Thank you for your order " + nameTextField.getText().substring(0, 1).toUpperCase()
									+ nameTextField.getText().substring(1).toLowerCase() + "." + "\n"
									+ "Your order number is: " + pizzaOrderHelper.getOrderNumber() + "\n"
									+ "Your order total is: $" + String.format("%.2f", pizzaOrderHelper.orderTotal()));
				} else {
					pizzaOrderDetails.setText("Please enter a name for your order.");
				}
			} else {
				pizzaOrderDetails.setText("You must add a pizza to the order before submitting.");
			}
		}
	}

	// ActionListetener for handling canceling the users pizza order
	class CancelClickListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			pizzaOrderHelper.clearOrder();
			nameTextField.setText("");
			pizzaOrderDetails.setText("");
			sizeGroup.clearSelection();
			toppingGroup.clearSelection();
			selectedTopping = null;
			selectedSize = null;
			pizzaDrawing.setSelectedSize(Pizza.SMALL_PIZZA);
			pizzaDrawing.setSelectedTopping(Pizza.CHEESE_PIZZA);
		}
	}

	// ActionListetener for handling adding another pizza to the order
	class AddPizzaClickListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				pizzaOrderHelper.add(new Pizza(selectedTopping, selectedSize));
				sizeGroup.clearSelection();
				toppingGroup.clearSelection();
				pizzaOrderDetails.setText(pizzaOrderHelper.orderDetails());
				selectedTopping = null;
				selectedSize = null;
			} catch (IllegalArgumentException ex) {
				pizzaOrderDetails.setText("You must select a size and a topping");
			}

		}
	}

	// ClickListener for handling user pizza size selection
	class SizeGroupClickListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == smallButton) {
				selectedSize = Pizza.SMALL_PIZZA;
			} else if (e.getSource() == mediumButton) {
				selectedSize = Pizza.MEDIUM_PIZZA;
			} else if (e.getSource() == largeButton) {
				selectedSize = Pizza.LARGE_PIZZA;
			} else if (e.getSource() == extraLargeButton) {
				selectedSize = Pizza.EXTRA_LARGE_PIZZA;
			}
			// Updates the pizza drawing based on user selection
			pizzaDrawing.setSelectedSize(selectedSize);
		}

	}

	// ClickListener for handling user pizza topping selection
	class ToppingGroupClickListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == cheeseButton) {
				selectedTopping = Pizza.CHEESE_PIZZA;
			} else if (e.getSource() == pepperoniButton) {
				selectedTopping = Pizza.PEPPERONI_PIZZA;
			} else if (e.getSource() == sausageButton) {
				selectedTopping = Pizza.SAUSAGE_PIZZA;
			}
			// Updates the pizza drawing based on user selection
			pizzaDrawing.setSelectedTopping(selectedTopping);
		}
	}
}