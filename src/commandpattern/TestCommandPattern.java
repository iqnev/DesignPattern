package commandpattern;

/**
 * 
 * @author iqnev
 *
 */
public class TestCommandPattern {

	public static void main(String[] args) {
		final Stock xStock = new Stock("Salam", 10);

		final BuyProduct bProduct = new BuyProduct(xStock);

		final Seller seller = new Seller();

		seller.takeOrder(bProduct);
		seller.exOrders();
	}

}
