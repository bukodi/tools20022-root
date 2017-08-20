package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class BBANIdentifier extends MMIdentifierSet {

	private final static AtomicReference<BBANIdentifier> repoTypeRef = new AtomicReference<>();

	public static BBANIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new BBANIdentifier());
		return repoTypeRef.get();
	}

	private BBANIdentifier() {
		super.identificationScheme = "National Banking Association; Basic Bank Account Number";
		super.pattern = "[a-zA-Z0-9]{1,30}";
		super.name = "BBANIdentifier";
		super.definition = "Basic Bank Account Number (BBAN). Identifier used nationally by financial institutions, ie, in individual countries, generally as part of a National Account Numbering Scheme(s), which uniquely identifies the account of a customer.";
		super.example = Arrays.asList("BARC12345612345678");
	}
}