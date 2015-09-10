package decoratorpattern;

/**
 * The <code>BulgarianWomen</code> class extends the {@link Women} class and
 * sets the {@link Women#description} filed.
 * 
 * @author iqnev
 *
 */
public class BulgarianWomen extends Women {

	/**
	 * The default constructor.
	 */
	public BulgarianWomen() {
		description = "beautiful woman";
	}
}
