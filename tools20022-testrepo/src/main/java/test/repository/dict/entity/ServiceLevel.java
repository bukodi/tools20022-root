package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class ServiceLevel extends MMBusinessComponent {

	private final static AtomicReference<ServiceLevel> repoTypeRef = new AtomicReference<>();

	public static ServiceLevel repoType() {
		repoTypeRef.compareAndSet(null, new ServiceLevel());
		return repoTypeRef.get();
	}

	private ServiceLevel() {
		super.associationDomain_lazy = () -> Arrays.asList(null);
		super.name = "ServiceLevel";
		super.definition = "Agreement under which or rules under which the transaction should be processed.";
	}
}