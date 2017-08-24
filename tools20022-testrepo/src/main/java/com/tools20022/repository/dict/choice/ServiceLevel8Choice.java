package com.tools20022.repository.dict.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class ServiceLevel8Choice extends MMChoiceComponent {

	private final static AtomicReference<ServiceLevel8Choice> repoTypeRef = new AtomicReference<>();

	public static ServiceLevel8Choice repoType() {
		repoTypeRef.compareAndSet(null, new ServiceLevel8Choice());
		return repoTypeRef.get();
	}

	private ServiceLevel8Choice() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "ServiceLevel8Choice";
		super.definition = "Specifies the service level of the transaction.";
	}
}