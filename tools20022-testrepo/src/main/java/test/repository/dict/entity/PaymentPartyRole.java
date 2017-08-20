package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;

public class PaymentPartyRole extends MMBusinessComponent {

	private final static AtomicReference<PaymentPartyRole> repoTypeRef = new AtomicReference<>();

	public static PaymentPartyRole repoType() {
		repoTypeRef.compareAndSet(null, new PaymentPartyRole());
		return repoTypeRef.get();
	}

	private PaymentPartyRole() {
		super.name = "PaymentPartyRole";
		super.definition = "Role played by a party in the context of a payment.";
	}
}