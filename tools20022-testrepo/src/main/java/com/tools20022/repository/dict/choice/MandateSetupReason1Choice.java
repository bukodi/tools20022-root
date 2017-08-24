package com.tools20022.repository.dict.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class MandateSetupReason1Choice extends MMChoiceComponent {

	private final static AtomicReference<MandateSetupReason1Choice> repoTypeRef = new AtomicReference<>();

	public static MandateSetupReason1Choice repoType() {
		repoTypeRef.compareAndSet(null, new MandateSetupReason1Choice());
		return repoTypeRef.get();
	}

	private MandateSetupReason1Choice() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "MandateSetupReason1Choice";
		super.definition = "Specifies the reason for the setup of the mandate.";
	}
}