package com.tools20022.repository.dict.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class AuthenticationChannel1Choice extends MMChoiceComponent {

	private final static AtomicReference<AuthenticationChannel1Choice> repoTypeRef = new AtomicReference<>();

	public static AuthenticationChannel1Choice repoType() {
		repoTypeRef.compareAndSet(null, new AuthenticationChannel1Choice());
		return repoTypeRef.get();
	}

	private AuthenticationChannel1Choice() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "AuthenticationChannel1Choice";
		super.definition = "Choice of format for an authentication channel.";
	}
}