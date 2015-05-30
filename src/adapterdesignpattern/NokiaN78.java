package adapterdesignpattern;

/**
 * A class that implements {@link Chargeable}.
 * 
 * @author iqnev
 *
 */
public class NokiaN78 implements Chargeable {

	@Override
	public void charge() {
		System.out.println("Charging Nokia N78 .....");
	}

}
