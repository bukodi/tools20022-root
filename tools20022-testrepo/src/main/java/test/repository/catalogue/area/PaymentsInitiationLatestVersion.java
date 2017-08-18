package test.repository.catalogue.area;

import com.tools20022.metamodel.MMBusinessArea;

public class PaymentsInitiationLatestVersion extends MMBusinessArea {

	private final static PaymentsInitiationLatestVersion INSTANCE = new PaymentsInitiationLatestVersion();

	public static PaymentsInitiationLatestVersion instance() {
		return INSTANCE;
	}
}