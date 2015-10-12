package commandpattern;

/**
 * The common class for products.
 * 
 * @author iqnev
 *
 */
public class Stock {
	private String nameProduct;
	private int qt;

	/**
	 * The default construct with initialization parameters.
	 * 
	 * @param nameProduct
	 *            the name of the product.
	 * @param qt
	 *            the quantity of the product.
	 */
	public Stock(final String nameProduct, final int qt) {
		this.nameProduct = nameProduct;
		this.qt = qt;
	}

	/**
	 * Prints the product info.
	 */
	protected void buy() {
		System.out.println("Stock.buy() { The name: " + nameProduct
				+ " } || { The QT: " + qt + " }");
	}

}
