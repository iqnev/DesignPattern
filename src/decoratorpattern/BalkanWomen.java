package decoratorpattern;

/**
 * The class that extends {@link WomenDecorator} class and adds additional
 * features it.
 * 
 * @author iqnev
 *
 */
public class BalkanWomen extends WomenDecorator {

	/**
	 * The instance of the women.
	 */
	private Women women;

	/**
	 * The default constructor with parameter.
	 * 
	 * @param women
	 *            the current women;
	 */
	public BalkanWomen(Women women) {
		this.women = women;
	}

	@Override
	public String getDescription() {
		return this.women.getDescription() + " with Big boobs!!!";
	}

}
