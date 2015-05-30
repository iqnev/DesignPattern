package adapterdesignpattern;

/**
 * This a class implementation Adapter Design Pattern for samsung phone and uses
 * <code>SamsungAce2</code>.
 * 
 * @author iqnev
 *
 */
public class SamsungAdapterPlug implements Chargeable {

	/**
	 * A variable by type <code>SamsungAce2</code>.
	 */
	SamsungAce2 samsungAce2;

	public SamsungAdapterPlug(SamsungAce2 samsungAce2) {
		this.samsungAce2 = samsungAce2;
	}

	@Override
	public void charge() {
		samsungAce2.samsungCharge();
	}

}
