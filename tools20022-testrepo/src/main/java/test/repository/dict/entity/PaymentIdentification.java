package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;

public class PaymentIdentification extends MMBusinessComponent {

	private final static AtomicReference<PaymentIdentification> repoTypeRef = new AtomicReference<>();

	public static PaymentIdentification repoType() {
		repoTypeRef.compareAndSet(null, new PaymentIdentification());
		return repoTypeRef.get();
	}

	private PaymentIdentification() {
		super.name = "PaymentIdentification";
		super.definition = "Specifies the different identifications associated with a payment transaction.";
	}
}