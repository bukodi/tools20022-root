package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class ItalianDomesticIdentifier extends MMIdentifierSet {

	private final static AtomicReference<ItalianDomesticIdentifier> repoTypeRef = new AtomicReference<>();

	public static ItalianDomesticIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new ItalianDomesticIdentifier());
		return repoTypeRef.get();
	}

	private ItalianDomesticIdentifier() {
		super.identificationScheme = "Associazione Bancaria Italiana; Italian Domestic Identification";
		super.pattern = "IT[0-9]{10,10}";
		super.name = "ItalianDomesticIdentifier";
		super.definition = "Italian Domestic Identification Code. Identifies Italian financial institutions on the Italian national clearing system. The code is assigned by the Associazione Bancaria Italiana (ABI).";
		super.example = Arrays.asList("IT1234567890");
	}
}