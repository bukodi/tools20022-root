package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTPartyIdentification43 extends MMMessageComponent {

	private final static AtomicReference<RTPartyIdentification43> repoTypeRef = new AtomicReference<>();

	public static RTPartyIdentification43 repoType() {
		repoTypeRef.compareAndSet(null, new RTPartyIdentification43());
		return repoTypeRef.get();
	}

	private RTPartyIdentification43() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "PartyIdentification43";
		super.definition = "Set of elements used to identify a person or an organisation.";
	}
}