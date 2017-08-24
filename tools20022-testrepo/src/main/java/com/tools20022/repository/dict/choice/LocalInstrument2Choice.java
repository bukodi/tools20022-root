package com.tools20022.repository.dict.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class LocalInstrument2Choice extends MMChoiceComponent {

	private final static AtomicReference<LocalInstrument2Choice> repoTypeRef = new AtomicReference<>();

	public static LocalInstrument2Choice repoType() {
		repoTypeRef.compareAndSet(null, new LocalInstrument2Choice());
		return repoTypeRef.get();
	}

	private LocalInstrument2Choice() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "LocalInstrument2Choice";
		super.definition = "Set of elements that further identifies the type of local instruments being requested by the initiating party.";
	}
}