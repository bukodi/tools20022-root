package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class PaymentExecution extends MMBusinessComponent {

	private final static AtomicReference<PaymentExecution> repoTypeRef = new AtomicReference<>();

	public static PaymentExecution repoType() {
		repoTypeRef.compareAndSet(null, new PaymentExecution());
		return repoTypeRef.get();
	}

	private PaymentExecution() {
		super.element = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "PaymentExecution";
		super.definition = "Process required for executing an end to end payment. It consists of a payment initiation which may be followed by a series of instructions.";
	}
}