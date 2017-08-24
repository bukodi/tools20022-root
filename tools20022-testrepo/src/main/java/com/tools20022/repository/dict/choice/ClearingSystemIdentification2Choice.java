package com.tools20022.repository.dict.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class ClearingSystemIdentification2Choice extends MMChoiceComponent {

	private final static AtomicReference<ClearingSystemIdentification2Choice> repoTypeRef = new AtomicReference<>();

	public static ClearingSystemIdentification2Choice repoType() {
		repoTypeRef.compareAndSet(null,
				new ClearingSystemIdentification2Choice());
		return repoTypeRef.get();
	}

	private ClearingSystemIdentification2Choice() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "ClearingSystemIdentification2Choice";
		super.definition = "Choice of a clearing system identifier.";
	}
}