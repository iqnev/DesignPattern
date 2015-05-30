package adapterdesignpattern;

public class RunChargerTest {

	public static void main(String[] args) {
		// Create a object of each mobile
		Nokia3310 nokia3310 = new Nokia3310();
		NokiaN78 nokiaN78 = new NokiaN78();
		SamsungAce2 samsungAce2 = new SamsungAce2();

		/**
		 * A new Samsung Adapter Plug which will map interface of Nokia charger
		 * to the interface of SamsungAce2 charging type.
		 */
		SamsungAdapterPlug samsungAdapterPlug = new SamsungAdapterPlug(
				samsungAce2);

		nokia3310.charge();
		nokiaN78.charge();
		samsungAdapterPlug.charge();

	}

}
