package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;
import java.util.Arrays;

public class LEIIdentifier extends MMIdentifierSet {

	private final static AtomicReference<LEIIdentifier> repoTypeRef = new AtomicReference<>();

	public static LEIIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new LEIIdentifier());
		return repoTypeRef.get();
	}

	private LEIIdentifier() {
		super.identificationScheme = "SWIFT and DTCC; LEIIdentifier";
		super.pattern = "[A-Z0-9]{18,18}[0-9]{2,2}";
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("123456789012345678");
		super.name = "LEIIdentifier";
		super.definition = "Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".";
	}
}