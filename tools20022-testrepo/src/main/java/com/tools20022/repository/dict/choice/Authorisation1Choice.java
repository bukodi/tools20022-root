package com.tools20022.repository.dict.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class Authorisation1Choice extends MMChoiceComponent {

	private final static AtomicReference<Authorisation1Choice> repoTypeRef = new AtomicReference<>();

	public static Authorisation1Choice repoType() {
		repoTypeRef.compareAndSet(null, new Authorisation1Choice());
		return repoTypeRef.get();
	}

	private Authorisation1Choice() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Authorisation1Choice";
		super.definition = "Provides the details on the user identification or any user key that allows to check if the initiating party is allowed to issue the transaction.";
	}
}