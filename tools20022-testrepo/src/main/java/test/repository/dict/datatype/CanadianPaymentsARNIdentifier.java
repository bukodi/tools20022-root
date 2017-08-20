package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class CanadianPaymentsARNIdentifier extends MMIdentifierSet {

	private final static AtomicReference<CanadianPaymentsARNIdentifier> repoTypeRef = new AtomicReference<>();

	public static CanadianPaymentsARNIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new CanadianPaymentsARNIdentifier());
		return repoTypeRef.get();
	}

	private CanadianPaymentsARNIdentifier() {
		super.identificationScheme = "Candian Payment Association; Payment Routing Number";
		super.pattern = "CA[0-9]{9,9}";
		super.name = "CanadianPaymentsARNIdentifier";
		super.definition = "Canadian Payments Association Routing Number. Identifies Canadian financial institutions on the Canadian national clearing system.";
		super.example = Arrays.asList("CA123456789");
	}
}