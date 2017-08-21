package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class CashClearingSystem extends MMBusinessComponent {

	private final static AtomicReference<CashClearingSystem> repoTypeRef = new AtomicReference<>();

	public static CashClearingSystem repoType() {
		repoTypeRef.compareAndSet(null, new CashClearingSystem());
		return repoTypeRef.get();
	}

	private CashClearingSystem() {
		super.element = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "CashClearingSystem";
		super.definition = "Clearing system that processes only cash transfers.";
	}
}