package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class ObligationFulfilment extends MMBusinessComponent {

	private final static AtomicReference<ObligationFulfilment> repoTypeRef = new AtomicReference<>();

	public static ObligationFulfilment repoType() {
		repoTypeRef.compareAndSet(null, new ObligationFulfilment());
		return repoTypeRef.get();
	}

	private ObligationFulfilment() {
		super.element = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "ObligationFulfilment";
		super.definition = "Processes by which an obligation is extinguished fully or partially.";
	}
}