package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;

public class PartyIdentification43 extends MMMessageComponent {

	private final static AtomicReference<PartyIdentification43> repoTypeRef = new AtomicReference<>();

	public static PartyIdentification43 repoType() {
		repoTypeRef.compareAndSet(null, new PartyIdentification43());
		return repoTypeRef.get();
	}

	private PartyIdentification43() {
		super.name = "PartyIdentification43";
		super.definition = "Set of elements used to identify a person or an organisation.";
	}
}