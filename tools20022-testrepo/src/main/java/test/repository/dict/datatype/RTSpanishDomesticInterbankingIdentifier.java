package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;
import java.util.Arrays;

public class RTSpanishDomesticInterbankingIdentifier extends MMIdentifierSet {

	private final static AtomicReference<RTSpanishDomesticInterbankingIdentifier> repoTypeRef = new AtomicReference<>();

	public static RTSpanishDomesticInterbankingIdentifier repoType() {
		repoTypeRef.compareAndSet(null,
				new RTSpanishDomesticInterbankingIdentifier());
		return repoTypeRef.get();
	}

	private RTSpanishDomesticInterbankingIdentifier() {
		super.identificationScheme = "Centro de Cooperacion Interbancaria (CCI); Spanish Domestic Interbanking Identifier";
		super.pattern = "ES[0-9]{8,9}";
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("ES12345678");
		super.name = "SpanishDomesticInterbankingIdentifier";
		super.definition = "Spanish Domestic Interbanking Code. Identifies Spanish financial institutions on the Spanish national clearing system. The code is assigned by the Centro de Cooperacion Interbancaria (CCI).";
	}
}