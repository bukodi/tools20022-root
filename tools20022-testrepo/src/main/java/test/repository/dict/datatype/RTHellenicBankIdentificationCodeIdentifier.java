package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;
import java.util.Arrays;

public class RTHellenicBankIdentificationCodeIdentifier extends MMIdentifierSet {

	private final static AtomicReference<RTHellenicBankIdentificationCodeIdentifier> repoTypeRef = new AtomicReference<>();

	public static RTHellenicBankIdentificationCodeIdentifier repoType() {
		repoTypeRef.compareAndSet(null,
				new RTHellenicBankIdentificationCodeIdentifier());
		return repoTypeRef.get();
	}

	private RTHellenicBankIdentificationCodeIdentifier() {
		super.identificationScheme = "Hellenic Central Bank; Payment Routing Number";
		super.pattern = "GR[0-9]{7,7}";
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("GR1234567");
		super.name = "HellenicBankIdentificationCodeIdentifier";
		super.definition = "Hellenic Bank Identification Code Identifier. Identifies Greek financial institutions on the greek national clearing system.";
	}
}