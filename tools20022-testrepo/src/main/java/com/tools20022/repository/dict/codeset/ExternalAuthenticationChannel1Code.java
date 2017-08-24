package com.tools20022.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;

public class ExternalAuthenticationChannel1Code extends MMCodeSet {

	private final static AtomicReference<ExternalAuthenticationChannel1Code> repoTypeRef = new AtomicReference<>();

	public static ExternalAuthenticationChannel1Code repoType() {
		repoTypeRef.compareAndSet(null,
				new ExternalAuthenticationChannel1Code());
		return repoTypeRef.get();
	}

	private ExternalAuthenticationChannel1Code() {
		super.maxLength = 4;
		super.minLength = 1;
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "ExternalAuthenticationChannel1Code";
		super.definition = "Specifies the transaction authentication channel, as published in an external authentication channel code set.\r\nExternal code sets can be downloaded from www.iso20022.org.";
		super.example = Arrays.asList("DUPL");
	}
}