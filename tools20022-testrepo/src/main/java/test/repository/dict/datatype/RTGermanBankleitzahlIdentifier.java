package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;
import java.util.Arrays;

public class RTGermanBankleitzahlIdentifier extends MMIdentifierSet {

	private final static AtomicReference<RTGermanBankleitzahlIdentifier> repoTypeRef = new AtomicReference<>();

	public static RTGermanBankleitzahlIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new RTGermanBankleitzahlIdentifier());
		return repoTypeRef.get();
	}

	private RTGermanBankleitzahlIdentifier() {
		super.identificationScheme = "Deutsche Bundesbank ; German Bankleitzahl";
		super.pattern = "BL[0-9]{8,8}";
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("BL12345678");
		super.name = "GermanBankleitzahlIdentifier";
		super.definition = "German Bankleitzahl. Identifies German financial institutions on the German national clearing systems.";
	}
}