package test.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class PartyIdentification43 extends MMMessageComponent {

	private final static AtomicReference<PartyIdentification43> repoTypeRef = new AtomicReference<>();

	public static PartyIdentification43 repoType() {
		repoTypeRef.compareAndSet(null, new PartyIdentification43());
		return repoTypeRef.get();
	}

	private PartyIdentification43() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "PartyIdentification43";
		super.definition = "Set of elements used to identify a person or an organisation.";
	}
}