package test.repository.dict.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;

public class ServiceLevel8Choice extends MMChoiceComponent {

	private final static AtomicReference<ServiceLevel8Choice> repoTypeRef = new AtomicReference<>();

	public static ServiceLevel8Choice repoType() {
		repoTypeRef.compareAndSet(null, new ServiceLevel8Choice());
		return repoTypeRef.get();
	}

	private ServiceLevel8Choice() {
		super.name = "ServiceLevel8Choice";
		super.definition = "Specifies the service level of the transaction.";
	}
}