package commandpattern;

/**
 * 
 * @author iqnev
 *
 */
public class BuyProduct implements Order {
	protected Stock stock;

	/**
	 * The default construct.
	 * 
	 * @param stock
	 *            the {@link Stock} object.
	 */
	public BuyProduct(final Stock stock) {
		this.stock = stock;
	}

	@Override
	public void execute() {
		stock.buy();
	}

}
