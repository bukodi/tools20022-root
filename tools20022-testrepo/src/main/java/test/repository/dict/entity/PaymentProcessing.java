package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class PaymentProcessing extends MMBusinessComponent {

	private final static AtomicReference<PaymentProcessing> repoTypeRef = new AtomicReference<>();

	public static PaymentProcessing repoType() {
		repoTypeRef.compareAndSet(null, new PaymentProcessing());
		return repoTypeRef.get();
	}

	private PaymentProcessing() {
		super.element = Arrays.asList();
		super.associationDomain_lazy = () -> Arrays.asList(null);
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "PaymentProcessing";
		super.definition = "Specifies how a payment must be processed, for instance through which specific clearing channel.";
	}
}