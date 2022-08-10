package model;

/**
 * Sabina Johnson - skaramuja CIS171 20517 WW1 Apr 28, 2022
 */

public class Pizza {
	private String topping;
	public String size;
	private double price;
	public static final String SMALL_PIZZA = "small";
	public static final String MEDIUM_PIZZA = "medium";
	public static final String LARGE_PIZZA = "large";
	public static final String EXTRA_LARGE_PIZZA = "extra large";
	public static final String CHEESE_PIZZA = "cheese";
	public static final String PEPPERONI_PIZZA = "pepperoni";
	public static final String SAUSAGE_PIZZA = "sausage";
	public double toppingAddOn = 0;
	public double sizeAddOn = 0;
	public static final double SMALL_PIZZA_PIRCE = 9.99;
	public static final double MEDIUM_PIZZA_PIRCE = 12.99;
	public static final double LARGE_PIZZA_PIRCE = 14.99;
	public static final double EXTRA_LARGE_PIZZA_PIRCE = 16.99;
	public static final double CHEESE_PIZZA_PIRCE = 1.00;
	public static final double PEPPERONI_PIZZA_PIRCE = 1.50;
	public static final double SAUSAGE_PIZZA_PIRCE = 1.50;

	// constructor that takes the topping, pizza size and price as parameters
	public Pizza(String topping, String size) {
		setTopping(topping);
		setSize(size);

		// a valid size must be selected or an IllegalArgumentException will be thrown
		if (getSize() == null) {
			throw new IllegalArgumentException("Object not created");
		}

		// a valid topping must be selected or an IllegalArgumentException will be thrown
		if (getTopping() == null) {
			throw new IllegalArgumentException("Object not created");
		}
	}

	/**
	 * @return the topping
	 */
	public String getTopping() {
		return topping;
	}

	/**
	 * @param topping the topping to set
	 */
	public void setTopping(String topping) {
		if (topping == CHEESE_PIZZA) {
			this.toppingAddOn = CHEESE_PIZZA_PIRCE;

		} else if (topping == PEPPERONI_PIZZA) {
			this.toppingAddOn = PEPPERONI_PIZZA_PIRCE;

		} else if (topping == SAUSAGE_PIZZA) {
			this.toppingAddOn = SAUSAGE_PIZZA_PIRCE;

		} else {
			throw new IllegalArgumentException();
		}
		this.topping = topping;
	}

	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		if (size == SMALL_PIZZA) {
			this.sizeAddOn = SMALL_PIZZA_PIRCE;

		} else if (size == MEDIUM_PIZZA) {
			this.sizeAddOn = MEDIUM_PIZZA_PIRCE;

		} else if (size == LARGE_PIZZA) {
			this.sizeAddOn = LARGE_PIZZA_PIRCE;

		} else if (size == EXTRA_LARGE_PIZZA) {
			this.sizeAddOn = EXTRA_LARGE_PIZZA_PIRCE;

		} else {
			throw new IllegalArgumentException();
		}
		this.size = size;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {

		return sizeAddOn + toppingAddOn;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * This method repeats the order to the user
	 * @return String with order details
	 */
	public String repeatOrder() {
		return "Topping: " + getTopping() + ", Size: " + getSize() + ", Price: $" + String.format("%.2f", getPrice());
	}
}