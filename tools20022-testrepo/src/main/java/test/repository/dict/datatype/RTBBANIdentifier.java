package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;
import java.util.Arrays;

public class RTBBANIdentifier extends MMIdentifierSet {

	private final static AtomicReference<RTBBANIdentifier> repoTypeRef = new AtomicReference<>();

	public static RTBBANIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new RTBBANIdentifier());
		return repoTypeRef.get();
	}

	private RTBBANIdentifier() {
		super.identificationScheme = "National Banking Association; Basic Bank Account Number";
		super.pattern = "[a-zA-Z0-9]{1,30}";
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("BARC12345612345678");
		super.name = "BBANIdentifier";
		super.definition = "Basic Bank Account Number (BBAN). Identifier used nationally by financial institutions, ie, in individual countries, generally as part of a National Account Numbering Scheme(s), which uniquely identifies the account of a customer.";
	}
}