package com.tools20022.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;

public class ExternalFinancialInstitutionIdentification1Code extends MMCodeSet {

	private final static AtomicReference<ExternalFinancialInstitutionIdentification1Code> repoTypeRef = new AtomicReference<>();

	public static ExternalFinancialInstitutionIdentification1Code repoType() {
		repoTypeRef.compareAndSet(null,
				new ExternalFinancialInstitutionIdentification1Code());
		return repoTypeRef.get();
	}

	private ExternalFinancialInstitutionIdentification1Code() {
		super.maxLength = 4;
		super.minLength = 1;
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "ExternalFinancialInstitutionIdentification1Code";
		super.definition = "Specifies the external financial institution identification scheme name code in the format of character string with a maximum length of 4 characters.\r\nThe list of valid codes is an external code list published separately.\r\nExternal code sets can be downloaded from www.iso20022.org.";
		super.example = Arrays.asList("EXC1");
	}
}