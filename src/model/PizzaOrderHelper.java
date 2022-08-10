package model;

import java.util.ArrayList;

/**
 * Sabina Johnson - skaramuja CIS171 20517 WW1 Apr 28, 2022
 */
public class PizzaOrderHelper {
	public ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
	private int orderNumber;
	private static int nextOrderNumber = 1001;

	/**
	 * @return the orderNumber
	 */
	public int getOrderNumber() {
		return orderNumber;
	}

	/**
	 * @method adds a pizza to the list of pizzas the user wants to order
	 */
	public void add(Pizza pizza) {
		pizzas.add(pizza);
	}

	/**
	 * @method clears all the pizzas the user has entered
	 */
	public void clearOrder() {
		pizzas.clear();
	}

	/**
	 * @method increments by one and stores new value in orderNumber
	 */
	public void placeOrder() {
		nextOrderNumber++;
		orderNumber = nextOrderNumber;

	}

	/**
	 * @method calculates the total order price 
	 * @return total price of pizzas ordered
	 */
	public double orderTotal() {
		double price = 0;
		for (int i = 0; i < pizzas.size(); i++) {
			price += pizzas.get(i).getPrice();
		}
		return price;
	}

	/**
	 * @method updated order details as users adds pizzas
	 * @return String with order details
	 */
	public String orderDetails() {
		String details = "";
		for (int i = 0; i < pizzas.size(); i++) {
			details += pizzas.get(i).repeatOrder();
			details += "\n";
		}
		return details;
	}
}