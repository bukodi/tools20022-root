package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class SpanishDomesticInterbankingIdentifier extends MMIdentifierSet {

	private final static AtomicReference<SpanishDomesticInterbankingIdentifier> repoTypeRef = new AtomicReference<>();

	public static SpanishDomesticInterbankingIdentifier repoType() {
		repoTypeRef.compareAndSet(null,
				new SpanishDomesticInterbankingIdentifier());
		return repoTypeRef.get();
	}

	private SpanishDomesticInterbankingIdentifier() {
		super.identificationScheme = "Centro de Cooperacion Interbancaria (CCI); Spanish Domestic Interbanking Identifier";
		super.pattern = "ES[0-9]{8,9}";
		super.name = "SpanishDomesticInterbankingIdentifier";
		super.definition = "Spanish Domestic Interbanking Code. Identifies Spanish financial institutions on the Spanish national clearing system. The code is assigned by the Centro de Cooperacion Interbancaria (CCI).";
		super.example = Arrays.asList("ES12345678");
	}
}