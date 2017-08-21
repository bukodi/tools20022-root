package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;
import java.util.Arrays;

public class RTItalianDomesticIdentifier extends MMIdentifierSet {

	private final static AtomicReference<RTItalianDomesticIdentifier> repoTypeRef = new AtomicReference<>();

	public static RTItalianDomesticIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new RTItalianDomesticIdentifier());
		return repoTypeRef.get();
	}

	private RTItalianDomesticIdentifier() {
		super.identificationScheme = "Associazione Bancaria Italiana; Italian Domestic Identification";
		super.pattern = "IT[0-9]{10,10}";
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("IT1234567890");
		super.name = "ItalianDomesticIdentifier";
		super.definition = "Italian Domestic Identification Code. Identifies Italian financial institutions on the Italian national clearing system. The code is assigned by the Associazione Bancaria Italiana (ABI).";
	}
}