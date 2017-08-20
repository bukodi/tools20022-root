package test.repository.catalogue.area;

import com.tools20022.metamodel.MMBusinessArea;
import java.util.concurrent.atomic.AtomicReference;

public class PaymentsInitiationLatestVersion extends MMBusinessArea {

	private final static AtomicReference<PaymentsInitiationLatestVersion> repoTypeRef = new AtomicReference<>();

	public static PaymentsInitiationLatestVersion repoType() {
		repoTypeRef.compareAndSet(null, new PaymentsInitiationLatestVersion());
		return repoTypeRef.get();
	}

	private PaymentsInitiationLatestVersion() {
		super.code = "pain";
		super.name = "Payments Initiation - Latest version - master";
		super.definition = "Messages that support the initiation of a payment from the ordering customer to a financial institution that services a cash account and reporting its status";
	}
}