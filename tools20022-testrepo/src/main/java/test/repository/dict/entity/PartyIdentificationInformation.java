package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;

public class PartyIdentificationInformation extends MMBusinessComponent {

	private final static AtomicReference<PartyIdentificationInformation> repoTypeRef = new AtomicReference<>();

	public static PartyIdentificationInformation repoType() {
		repoTypeRef.compareAndSet(null, new PartyIdentificationInformation());
		return repoTypeRef.get();
	}

	private PartyIdentificationInformation() {
		super.associationDomain_lazy = () -> Arrays.asList(null);
		super.name = "PartyIdentificationInformation";
		super.definition = "Unique and unambiguous way to identify a party";
	}
}