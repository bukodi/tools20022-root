package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class HellenicBankIdentificationCodeIdentifier extends MMIdentifierSet {

	private final static AtomicReference<HellenicBankIdentificationCodeIdentifier> repoTypeRef = new AtomicReference<>();

	public static HellenicBankIdentificationCodeIdentifier repoType() {
		repoTypeRef.compareAndSet(null,
				new HellenicBankIdentificationCodeIdentifier());
		return repoTypeRef.get();
	}

	private HellenicBankIdentificationCodeIdentifier() {
		super.identificationScheme = "Hellenic Central Bank; Payment Routing Number";
		super.pattern = "GR[0-9]{7,7}";
		super.name = "HellenicBankIdentificationCodeIdentifier";
		super.definition = "Hellenic Bank Identification Code Identifier. Identifies Greek financial institutions on the greek national clearing system.";
		super.example = Arrays.asList("GR1234567");
	}
}