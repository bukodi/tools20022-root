package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;
import java.util.Arrays;

public class RTMICIdentifier extends MMIdentifierSet {

	private final static AtomicReference<RTMICIdentifier> repoTypeRef = new AtomicReference<>();

	public static RTMICIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new RTMICIdentifier());
		return repoTypeRef.get();
	}

	private RTMICIdentifier() {
		super.identificationScheme = "SWIFT; MICIdentifier";
		super.pattern = "[A-Z0-9]{4,4}";
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("XTKS");
		super.name = "MICIdentifier";
		super.definition = "Market Identifier Code. The identification of a financial market, as stipulated in the norm ISO 10383 'Codes for exchanges and market identifications'.";
	}
}