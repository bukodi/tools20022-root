package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;
import java.util.Arrays;

public class RTUPICIdentifier extends MMIdentifierSet {

	private final static AtomicReference<RTUPICIdentifier> repoTypeRef = new AtomicReference<>();

	public static RTUPICIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new RTUPICIdentifier());
		return repoTypeRef.get();
	}

	private RTUPICIdentifier() {
		super.identificationScheme = "The Clearing House (formerly The New York Clearing House); Universal Payment Identification Code";
		super.pattern = "[0-9]{8,17}";
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("12345678");
		super.name = "UPICIdentifier";
		super.definition = "Universal Payment Identification Code (UPIC).  Identifier used by the New York Clearing House to mask confidential data, such as bank accounts and bank routing numbers. UPIC numbers remain with business customers, regardless of banking relationship changes.";
	}
}