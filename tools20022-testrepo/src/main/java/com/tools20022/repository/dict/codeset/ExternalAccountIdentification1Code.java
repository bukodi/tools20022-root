package com.tools20022.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;

public class ExternalAccountIdentification1Code extends MMCodeSet {

	private final static AtomicReference<ExternalAccountIdentification1Code> repoTypeRef = new AtomicReference<>();

	public static ExternalAccountIdentification1Code repoType() {
		repoTypeRef.compareAndSet(null,
				new ExternalAccountIdentification1Code());
		return repoTypeRef.get();
	}

	private ExternalAccountIdentification1Code() {
		super.maxLength = 4;
		super.minLength = 1;
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "ExternalAccountIdentification1Code";
		super.definition = "Specifies the external account identification scheme name code in the format of character string with a maximum length of 4 characters.\r\nThe list of valid codes is an external code list published separately.\r\nExternal code sets can be downloaded from www.iso20022.org.";
		super.example = Arrays.asList("BBAN");
	}
}