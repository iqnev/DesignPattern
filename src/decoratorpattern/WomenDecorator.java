package decoratorpattern;

/**
 * Creates abstract decorator class extending {@link Women} class.
 * 
 * @author iqnev
 *
 */
public abstract class WomenDecorator extends Women {

	/**
	 * Returns a description.
	 */
	public abstract String getDescription();
}
