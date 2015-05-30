package adapterdesignpattern;

/**
 * A class that implements {@link Chargeable}.
 * 
 * @author iqnev
 *
 */
public class Nokia3310 implements Chargeable {

	@Override
	public void charge() {
		System.out.println("Charging Nokia 3310 .....");

	}

}
