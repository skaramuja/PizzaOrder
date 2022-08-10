package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

/**
 * Sabina Johnson - skaramuja CIS171 20517 WW1 Apr 28, 2022
 */
public class PizzaDrawing extends JComponent {

	private static int SMALL_PIZZA_WIDTH = 150;
	private static int SMALL_PIZZA_HEIGHT = 150;
	private static int MEDIUM_PIZZA_WIDTH = 200;
	private static int MEDIUM_PIZZA_HEIGHT = 200;
	private static int LARGE_PIZZA_WIDTH = 250;
	private static int LARGE_PIZZA_HEIGHT = 250;
	private static int EXTRA_LARGE_PIZZA_WIDTH = 300;
	private static int EXTRA_LARGE_PIZZA_HEIGHT = 300;
	private static int SAUSAGE_WIDTH_AND_HEIGHT = 15;
	private static int PEPPERONI_WIDTH_AND_HEIGHT = 25;

	Color pizza = Color.pink;
	Color cheese = Color.yellow;
	Color pepperoni = Color.red;
	Color sausage = Color.orange;
	String activeColor = "white";

	int pizzaWidth = PizzaDrawing.SMALL_PIZZA_WIDTH;
	int pizzaHeight = PizzaDrawing.SMALL_PIZZA_HEIGHT;
	String pizzaSize;

	String topping = Pizza.CHEESE_PIZZA;

	/**
	 * @method updated size setting for Pizza drawing
	 * @param size - of Pizza user selected
	 */
	public void setSelectedSize(String size) {
		pizzaSize = size;
		if (size == Pizza.SMALL_PIZZA) {
			pizzaWidth = SMALL_PIZZA_WIDTH;
			pizzaHeight = SMALL_PIZZA_HEIGHT;
		} else if (size == Pizza.MEDIUM_PIZZA) {
			pizzaWidth = MEDIUM_PIZZA_WIDTH;
			pizzaHeight = MEDIUM_PIZZA_HEIGHT;
		} else if (size == Pizza.LARGE_PIZZA) {
			pizzaWidth = LARGE_PIZZA_WIDTH;
			pizzaHeight = LARGE_PIZZA_HEIGHT;
		} else if (size == Pizza.EXTRA_LARGE_PIZZA) {
			pizzaWidth = EXTRA_LARGE_PIZZA_WIDTH;
			pizzaHeight = EXTRA_LARGE_PIZZA_HEIGHT;
		}

		repaint();
	}

	/**
	 * @method updated topping setting for Pizza drawing
	 * @param topping of Pizza user selected
	 */
	public void setSelectedTopping(String topping) {
		this.topping = topping;
		repaint();
	}

	/**
	 * @method updated pizza drawing based on user size and topping selection
	 * @param g - handles drawing
	 */
	@Override
	public void paintComponent(Graphics g) {
		Graphics2D pizzaPie = (Graphics2D) g;

		pizzaPie.setColor(Color.LIGHT_GRAY);
		pizzaPie.fillRect(0, 0, 700, 400);

		int originX = g.getClipBounds().width / 2 - pizzaWidth / 2;
		int originY = g.getClipBounds().height / 2 - pizzaHeight / 2;

		pizzaPie.setColor(Color.black);
		pizzaPie.drawOval(originX, originY, pizzaWidth, pizzaHeight);

		pizzaPie.setColor(pizza);
		pizzaPie.fillOval(originX + 1, originY + 1, pizzaWidth - 2, pizzaHeight - 2);

		pizzaPie.setColor(cheese);
		pizzaPie.fillOval(originX + 10, originY + 10, pizzaWidth - 20, pizzaHeight - 20);

		if (pizzaSize == Pizza.SMALL_PIZZA) {
			smallPizzaTopping(pizzaPie, originX, originY);
		} else if (pizzaSize == Pizza.MEDIUM_PIZZA) {
			mediumPizzaTopping(pizzaPie, originX, originY);
		} else if (pizzaSize == Pizza.LARGE_PIZZA) {
			largePizzaTopping(pizzaPie, originX, originY);
		} else if (pizzaSize == Pizza.EXTRA_LARGE_PIZZA) {
			extraLargePizzaTopping(pizzaPie, originX, originY);
		}

	}

	/**
	 * @method updated pepperoni or sausage topping on small pizza drawing based on
	 *         user selection
	 * @param pizza   pie - pizza size drawing
	 * @param originX - location of pizza on x-axis
	 * @param originY - location of pizza on y-axis
	 */
	void smallPizzaTopping(Graphics2D pizzaPie, int originX, int originY) {
		if (topping == Pizza.PEPPERONI_PIZZA) {
			pizzaPie.setColor(pepperoni);
			pizzaPie.fillOval(originX + 65, originY + 65, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 90, originY + 90, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 110, originY + 60, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 35, originY + 90, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 90, originY + 25, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 50, originY + 25, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 15, originY + 55, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

		} else if (topping == Pizza.SAUSAGE_PIZZA) {
			pizzaPie.setColor(sausage);
			pizzaPie.fillOval(originX + 50, originY + 50, 15, 15);

			pizzaPie.fillOval(originX + 90, originY + 90, 15, 15);

			pizzaPie.fillOval(originX + 120, originY + 50, 15, 15);

			pizzaPie.fillOval(originX + 35, originY + 90, 15, 15);

			pizzaPie.fillOval(originX + 90, originY + 25, 15, 15);

			pizzaPie.fillOval(originX + 15, originY + 55, 15, 15);

			pizzaPie.fillOval(originX + 75, originY + 112, 15, 15);
		}

	}

	/**
	 * @method updated pepperoni or sausage topping on medium pizza drawing based on
	 *         user selection
	 * @param pizza   pie - pizza size drawing
	 * @param originX - location of pizza on x-axis
	 * @param originY - location of pizza on y-axis
	 */
	void mediumPizzaTopping(Graphics2D pizzaPie, int originX, int originY) {
		if (topping == Pizza.PEPPERONI_PIZZA) {
			pizzaPie.setColor(pepperoni);
			pizzaPie.fillOval(originX + 50, originY + 50, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 90, originY + 90, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 120, originY + 50, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 150, originY + 90, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 35, originY + 90, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 125, originY + 135, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 60, originY + 140, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 90, originY + 25, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

		} else if (topping == Pizza.SAUSAGE_PIZZA) {
			pizzaPie.setColor(sausage);
			pizzaPie.fillOval(originX + 50, originY + 50, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 90, originY + 90, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 120, originY + 50, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 150, originY + 90, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 35, originY + 90, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 125, originY + 135, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 60, originY + 140, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 90, originY + 25, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);
		}

	}

	/**
	 * @method updated pepperoni or sausage topping on medium pizza drawing based on
	 *         user selection
	 * @param pizza   pie - pizza size drawing
	 * @param originX - location of pizza on x-axis
	 * @param originY - location of pizza on y-axis
	 */
	void largePizzaTopping(Graphics2D pizzaPie, int originX, int originY) {
		if (topping == Pizza.PEPPERONI_PIZZA) {
			pizzaPie.setColor(pepperoni);
			pizzaPie.fillOval(originX + 50, originY + 50, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 90, originY + 90, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 120, originY + 50, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 150, originY + 90, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 35, originY + 90, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 125, originY + 135, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 60, originY + 140, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 90, originY + 25, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 180, originY + 40, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 200, originY + 75, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 119, originY + 50, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 150, originY + 170, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 120, originY + 200, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 190, originY + 105, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 100, originY + 160, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 60, originY + 190, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 190, originY + 160, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

		} else if (topping == Pizza.SAUSAGE_PIZZA) {
			pizzaPie.setColor(sausage);
			pizzaPie.fillOval(originX + 50, originY + 50, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 90, originY + 90, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 120, originY + 50, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 150, originY + 90, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 35, originY + 90, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 125, originY + 135, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 60, originY + 140, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 90, originY + 25, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 180, originY + 40, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 200, originY + 75, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 119, originY + 50, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 150, originY + 170, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 120, originY + 200, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 190, originY + 105, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 100, originY + 160, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 60, originY + 190, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 190, originY + 160, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);
		}

	}

	/**
	 * @method updated pepperoni or sausage topping on medium pizza drawing based on
	 *         user selection
	 * @param pizza   pie - pizza size drawing
	 * @param originX - location of pizza on x-axis
	 * @param originY - location of pizza on y-axis
	 */
	void extraLargePizzaTopping(Graphics2D pizzaPie, int originX, int originY) {
		if (topping == Pizza.PEPPERONI_PIZZA) {
			pizzaPie.setColor(pepperoni);
			pizzaPie.fillOval(originX + 50, originY + 50, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 90, originY + 90, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 120, originY + 50, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 150, originY + 90, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 35, originY + 90, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 125, originY + 135, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 60, originY + 140, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 90, originY + 25, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 180, originY + 40, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 200, originY + 75, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 119, originY + 50, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 150, originY + 170, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 120, originY + 200, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 190, originY + 105, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 100, originY + 160, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 60, originY + 190, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 190, originY + 160, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 220, originY + 190, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 200, originY + 220, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 160, originY + 240, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 110, originY + 230, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 250, originY + 150, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 240, originY + 120, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 240, originY + 80, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 30, originY + 180, PEPPERONI_WIDTH_AND_HEIGHT, PEPPERONI_WIDTH_AND_HEIGHT);

		} else if (topping == Pizza.SAUSAGE_PIZZA) {
			pizzaPie.setColor(sausage);
			pizzaPie.fillOval(originX + 50, originY + 50, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 90, originY + 90, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 120, originY + 50, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 150, originY + 90, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 35, originY + 90, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 125, originY + 135, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 60, originY + 140, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 90, originY + 25, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 180, originY + 40, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 200, originY + 75, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 119, originY + 50, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 150, originY + 170, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 120, originY + 200, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 190, originY + 105, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 100, originY + 160, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 60, originY + 190, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 190, originY + 160, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 220, originY + 190, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 200, originY + 220, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 160, originY + 240, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 110, originY + 230, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 250, originY + 150, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 240, originY + 120, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 240, originY + 80, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);

			pizzaPie.fillOval(originX + 30, originY + 180, SAUSAGE_WIDTH_AND_HEIGHT, SAUSAGE_WIDTH_AND_HEIGHT);
		}
	}
}