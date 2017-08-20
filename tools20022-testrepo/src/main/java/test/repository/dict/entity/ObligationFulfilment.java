package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;

public class ObligationFulfilment extends MMBusinessComponent {

	private final static AtomicReference<ObligationFulfilment> repoTypeRef = new AtomicReference<>();

	public static ObligationFulfilment repoType() {
		repoTypeRef.compareAndSet(null, new ObligationFulfilment());
		return repoTypeRef.get();
	}

	private ObligationFulfilment() {
		super.name = "ObligationFulfilment";
		super.definition = "Processes by which an obligation is extinguished fully or partially.";
	}
}