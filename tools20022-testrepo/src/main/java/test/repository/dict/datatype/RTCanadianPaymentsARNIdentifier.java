package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import test.repository.GeneratedRepository.DataDictionary;
import java.util.Arrays;

public class RTCanadianPaymentsARNIdentifier extends MMIdentifierSet {

	private final static AtomicReference<RTCanadianPaymentsARNIdentifier> repoTypeRef = new AtomicReference<>();

	public static RTCanadianPaymentsARNIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new RTCanadianPaymentsARNIdentifier());
		return repoTypeRef.get();
	}

	private RTCanadianPaymentsARNIdentifier() {
		super.identificationScheme = "Candian Payment Association; Payment Routing Number";
		super.pattern = "CA[0-9]{9,9}";
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("CA123456789");
		super.name = "CanadianPaymentsARNIdentifier";
		super.definition = "Canadian Payments Association Routing Number. Identifies Canadian financial institutions on the Canadian national clearing system.";
	}
}