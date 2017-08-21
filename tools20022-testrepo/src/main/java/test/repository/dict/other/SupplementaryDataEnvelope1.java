package test.repository.dict.other;

import com.tools20022.metamodel.MMExternalSchema;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;

public class SupplementaryDataEnvelope1 extends MMExternalSchema {

	private final static AtomicReference<SupplementaryDataEnvelope1> repoTypeRef = new AtomicReference<>();

	public static SupplementaryDataEnvelope1 repoType() {
		repoTypeRef.compareAndSet(null, new SupplementaryDataEnvelope1());
		return repoTypeRef.get();
	}

	private SupplementaryDataEnvelope1() {
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "SupplementaryDataEnvelope1";
		super.definition = "Technical component that contains the validated supplementary data information. This technical envelope allows to segregate the supplementary data information from any other information.";
	}
}