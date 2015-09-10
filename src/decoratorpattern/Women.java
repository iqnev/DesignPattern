package decoratorpattern;

/**
 * The abstract class that provides the necessary information for a current
 * women.
 * 
 * @author iqnev
 *
 */
public abstract class Women {

	/**
	 * The mainly description.
	 */
	public String description = "no description";

	/**
	 * Returns the current description.
	 * 
	 * @return the description.
	 */
	public String getDescription() {
		return description;
	}
}
