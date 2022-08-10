package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Pizza;
import model.PizzaOrderHelper;

/**
 * Sabina Johnson - skaramuja CIS171 20517 WW1 Apr 30, 2022
 */
class PizzaOrderHelperTest {

	PizzaOrderHelper pizzaOrderHelper = new PizzaOrderHelper();

	/**
	 * Test method for {@link model.PizzaOrderHelper#add(model.Pizza)}.
	 */
	@Test
	void testAdd() {
		Pizza pizza = new Pizza(Pizza.CHEESE_PIZZA, Pizza.SMALL_PIZZA);
		pizzaOrderHelper.add(pizza);
		assertEquals(pizzaOrderHelper.pizzas.contains(pizza), true);
	}

	/**
	 * Test method for {@link model.PizzaOrderHelper#add(model.Pizza)}.
	 */
	@Test
	void testAdd2() {
		Pizza pizza = new Pizza(Pizza.PEPPERONI_PIZZA, Pizza.LARGE_PIZZA);
		pizzaOrderHelper.add(pizza);
		assertEquals(pizzaOrderHelper.pizzas.contains(pizza), true);
	}

	/**
	 * Test method for {@link model.PizzaOrderHelper#clearOrder()}.
	 */
	@Test
	void testClearOrder() {
		Pizza pizza = new Pizza(Pizza.SAUSAGE_PIZZA, Pizza.MEDIUM_PIZZA);
		pizzaOrderHelper.add(pizza);
		pizzaOrderHelper.clearOrder();
		assertEquals(pizzaOrderHelper.pizzas.isEmpty(), true);

	}

	/**
	 * Test method for {@link model.PizzaOrderHelper#clearOrder()}.
	 */
	@Test
	void testClearOrder2() {
		Pizza pizza = new Pizza(Pizza.CHEESE_PIZZA, Pizza.EXTRA_LARGE_PIZZA);
		pizzaOrderHelper.add(pizza);
		pizzaOrderHelper.clearOrder();
		assertEquals(pizzaOrderHelper.pizzas.isEmpty(), true);

	}

	/**
	 * Test method for {@link model.PizzaOrderHelper#placeOrder()}.
	 */
	@Test
	void testPlaceOrder() {
		pizzaOrderHelper.placeOrder();
		pizzaOrderHelper.getOrderNumber();
		assertEquals(pizzaOrderHelper.getOrderNumber(), 1002);

	}

	/**
	 * Test method for {@link model.PizzaOrderHelper#orderTotal()}.
	 */
	@Test
	void testOrderTotal() {
		Pizza pizza = new Pizza(Pizza.CHEESE_PIZZA, Pizza.SMALL_PIZZA);
		pizzaOrderHelper.add(pizza);
		assertEquals(pizzaOrderHelper.orderTotal(), 10.99, 0.01);

	}

	/**
	 * Test method for {@link model.PizzaOrderHelper#orderTotal()}.
	 */
	@Test
	void testOrderTotal2() {
		Pizza pizza = new Pizza(Pizza.CHEESE_PIZZA, Pizza.MEDIUM_PIZZA);
		pizzaOrderHelper.add(pizza);
		assertEquals(pizzaOrderHelper.orderTotal(), 13.99, 0.01);

	}

	/**
	 * Test method for {@link model.PizzaOrderHelper#orderTotal()}.
	 */
	@Test
	void testOrderTotal3() {
		Pizza pizza = new Pizza(Pizza.CHEESE_PIZZA, Pizza.LARGE_PIZZA);
		pizzaOrderHelper.add(pizza);
		assertEquals(pizzaOrderHelper.orderTotal(), 15.99, 0.01);

	}

	/**
	 * Test method for {@link model.PizzaOrderHelper#orderTotal()}.
	 */
	@Test
	void testOrderTotal4() {
		Pizza pizza = new Pizza(Pizza.CHEESE_PIZZA, Pizza.EXTRA_LARGE_PIZZA);
		pizzaOrderHelper.add(pizza);
		assertEquals(pizzaOrderHelper.orderTotal(), 17.99, 0.01);

	}

	/**
	 * Test method for {@link model.PizzaOrderHelper#orderTotal()}.
	 */
	@Test
	void testOrderTotal5() {
		Pizza pizza = new Pizza(Pizza.PEPPERONI_PIZZA, Pizza.SMALL_PIZZA);
		pizzaOrderHelper.add(pizza);
		assertEquals(pizzaOrderHelper.orderTotal(), 11.49, 0.01);

	}

	/**
	 * Test method for {@link model.PizzaOrderHelper#orderTotal()}.
	 */
	@Test
	void testOrderTotal6() {
		Pizza pizza = new Pizza(Pizza.PEPPERONI_PIZZA, Pizza.MEDIUM_PIZZA);
		pizzaOrderHelper.add(pizza);
		assertEquals(pizzaOrderHelper.orderTotal(), 14.49, 0.01);

	}

	/**
	 * Test method for {@link model.PizzaOrderHelper#orderTotal()}.
	 */
	@Test
	void testOrderTotal7() {
		Pizza pizza = new Pizza(Pizza.PEPPERONI_PIZZA, Pizza.LARGE_PIZZA);
		pizzaOrderHelper.add(pizza);

		assertEquals(pizzaOrderHelper.orderTotal(), 16.49, 0.01);

	}

	/**
	 * Test method for {@link model.PizzaOrderHelper#orderTotal()}.
	 */
	@Test
	void testOrderTotal8() {
		Pizza pizza = new Pizza(Pizza.PEPPERONI_PIZZA, Pizza.EXTRA_LARGE_PIZZA);
		pizzaOrderHelper.add(pizza);
		assertEquals(pizzaOrderHelper.orderTotal(), 18.49, 0.01);

	}

	/**
	 * Test method for {@link model.PizzaOrderHelper#orderTotal()}.
	 */
	@Test
	void testOrderTotal9() {
		Pizza pizza = new Pizza(Pizza.SAUSAGE_PIZZA, Pizza.SMALL_PIZZA);
		pizzaOrderHelper.add(pizza);
		assertEquals(pizzaOrderHelper.orderTotal(), 11.49, 0.01);

	}

	/**
	 * Test method for {@link model.PizzaOrderHelper#orderTotal()}.
	 */
	@Test
	void testOrderTotal10() {
		Pizza pizza = new Pizza(Pizza.SAUSAGE_PIZZA, Pizza.MEDIUM_PIZZA);
		pizzaOrderHelper.add(pizza);
		assertEquals(pizzaOrderHelper.orderTotal(), 14.49, 0.01);

	}

	/**
	 * Test method for {@link model.PizzaOrderHelper#orderTotal()}.
	 */
	@Test
	void testOrderTota11() {
		Pizza pizza = new Pizza(Pizza.SAUSAGE_PIZZA, Pizza.LARGE_PIZZA);
		pizzaOrderHelper.add(pizza);

		assertEquals(pizzaOrderHelper.orderTotal(), 16.49, 0.01);

	}

	/**
	 * Test method for {@link model.PizzaOrderHelper#orderTotal()}.
	 */
	@Test
	void testOrderTotal12() {
		Pizza pizza = new Pizza(Pizza.SAUSAGE_PIZZA, Pizza.EXTRA_LARGE_PIZZA);
		pizzaOrderHelper.add(pizza);
		assertEquals(pizzaOrderHelper.orderTotal(), 18.49, 0.01);

	}

	/**
	 * // * Test method for {@link model.PizzaOrderHelper#orderDetails()}. //
	 */
	@Test
	void testOrderDetails() {
		Pizza pizza = new Pizza(Pizza.CHEESE_PIZZA, Pizza.SMALL_PIZZA);
		pizzaOrderHelper.add(pizza);
		assertEquals(pizzaOrderHelper.orderDetails(), "Topping: cheese, Size: small, Price: $10.99\n");
	}

	/**
	 * // * Test method for {@link model.PizzaOrderHelper#orderDetails()}. //
	 */
	@Test
	void testOrderDetails1() {
		Pizza pizza = new Pizza(Pizza.CHEESE_PIZZA, Pizza.MEDIUM_PIZZA);
		pizzaOrderHelper.add(pizza);
		assertEquals(pizzaOrderHelper.orderDetails(), "Topping: cheese, Size: medium, Price: $13.99\n");
	}

	/**
	 * // * Test method for {@link model.PizzaOrderHelper#orderDetails()}. //
	 */
	@Test
	void testOrderDetails2() {
		Pizza pizza = new Pizza(Pizza.CHEESE_PIZZA, Pizza.LARGE_PIZZA);
		pizzaOrderHelper.add(pizza);
		assertEquals(pizzaOrderHelper.orderDetails(), "Topping: cheese, Size: large, Price: $15.99\n");
	}

	/**
	 * // * Test method for {@link model.PizzaOrderHelper#orderDetails()}. //
	 */
	@Test
	void testOrderDetails3() {
		Pizza pizza = new Pizza(Pizza.CHEESE_PIZZA, Pizza.EXTRA_LARGE_PIZZA);
		pizzaOrderHelper.add(pizza);
		assertEquals(pizzaOrderHelper.orderDetails(), "Topping: cheese, Size: extra large, Price: $17.99\n");
	}

	/**
	 * // * Test method for {@link model.PizzaOrderHelper#orderDetails()}. //
	 */
	@Test
	void testOrderDetails4() {
		Pizza pizza = new Pizza(Pizza.PEPPERONI_PIZZA, Pizza.SMALL_PIZZA);
		pizzaOrderHelper.add(pizza);
		assertEquals(pizzaOrderHelper.orderDetails(), "Topping: pepperoni, Size: small, Price: $11.49\n");
	}

	/**
	 * // * Test method for {@link model.PizzaOrderHelper#orderDetails()}. //
	 */
	@Test
	void testOrderDetails5() {
		Pizza pizza = new Pizza(Pizza.PEPPERONI_PIZZA, Pizza.MEDIUM_PIZZA);
		pizzaOrderHelper.add(pizza);
		assertEquals(pizzaOrderHelper.orderDetails(), "Topping: pepperoni, Size: medium, Price: $14.49\n");
	}

	/**
	 * // * Test method for {@link model.PizzaOrderHelper#orderDetails()}. //
	 */
	@Test
	void testOrderDetails6() {
		Pizza pizza = new Pizza(Pizza.PEPPERONI_PIZZA, Pizza.LARGE_PIZZA);
		pizzaOrderHelper.add(pizza);
		assertEquals(pizzaOrderHelper.orderDetails(), "Topping: pepperoni, Size: large, Price: $16.49\n");
	}

	/**
	 * // * Test method for {@link model.PizzaOrderHelper#orderDetails()}. //
	 */
	@Test
	void testOrderDetails7() {
		Pizza pizza = new Pizza(Pizza.PEPPERONI_PIZZA, Pizza.EXTRA_LARGE_PIZZA);
		pizzaOrderHelper.add(pizza);
		assertEquals(pizzaOrderHelper.orderDetails(), "Topping: pepperoni, Size: extra large, Price: $18.49\n");
	}

	/**
	 * // * Test method for {@link model.PizzaOrderHelper#orderDetails()}. //
	 */
	@Test
	void testOrderDetails8() {
		Pizza pizza = new Pizza(Pizza.SAUSAGE_PIZZA, Pizza.SMALL_PIZZA);
		pizzaOrderHelper.add(pizza);
		assertEquals(pizzaOrderHelper.orderDetails(), "Topping: sausage, Size: small, Price: $11.49\n");
	}

	/**
	 * // * Test method for {@link model.PizzaOrderHelper#orderDetails()}. //
	 */
	@Test
	void testOrderDetails9() {
		Pizza pizza = new Pizza(Pizza.SAUSAGE_PIZZA, Pizza.MEDIUM_PIZZA);
		pizzaOrderHelper.add(pizza);
		assertEquals(pizzaOrderHelper.orderDetails(), "Topping: sausage, Size: medium, Price: $14.49\n");
	}

	/**
	 * // * Test method for {@link model.PizzaOrderHelper#orderDetails()}. //
	 */
	@Test
	void testOrderDetails10() {
		Pizza pizza = new Pizza(Pizza.SAUSAGE_PIZZA, Pizza.LARGE_PIZZA);
		pizzaOrderHelper.add(pizza);
		assertEquals(pizzaOrderHelper.orderDetails(), "Topping: sausage, Size: large, Price: $16.49\n");
	}

	/**
	 * // * Test method for {@link model.PizzaOrderHelper#orderDetails()}. //
	 */
	@Test
	void testOrderDetails11() {
		Pizza pizza = new Pizza(Pizza.SAUSAGE_PIZZA, Pizza.EXTRA_LARGE_PIZZA);
		pizzaOrderHelper.add(pizza);
		assertEquals(pizzaOrderHelper.orderDetails(), "Topping: sausage, Size: extra large, Price: $18.49\n");
	}
}
