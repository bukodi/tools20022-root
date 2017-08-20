package test.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class AustrianBankleitzahlIdentifier extends MMIdentifierSet {

	private final static AtomicReference<AustrianBankleitzahlIdentifier> repoTypeRef = new AtomicReference<>();

	public static AustrianBankleitzahlIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new AustrianBankleitzahlIdentifier());
		return repoTypeRef.get();
	}

	private AustrianBankleitzahlIdentifier() {
		super.identificationScheme = "Oesterreichische NationalBank; Austrian Bankleitzahl";
		super.pattern = "AT[0-9]{5,5}";
		super.name = "AustrianBankleitzahlIdentifier";
		super.definition = "Austrian Bankleitzahl. Identifies Austrian financial institutions on the Austrian national clearing system.";
		super.example = Arrays.asList("AT12345");
	}
}