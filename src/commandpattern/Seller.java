package commandpattern;

import java.util.ArrayList;

/**
 * 
 * @author iqnev
 *
 */
public class Seller {
	private ArrayList<Order> orders = new ArrayList<Order>();

	public void takeOrder(final Order or) {
		orders.add(or);
	}

	public void exOrders() {
		for (Order order : orders) {
			order.execute();
		}

		orders.clear();
	}
}
