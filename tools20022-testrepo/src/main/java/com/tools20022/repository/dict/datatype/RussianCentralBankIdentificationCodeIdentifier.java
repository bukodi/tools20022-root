package com.tools20022.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;

public class RussianCentralBankIdentificationCodeIdentifier
		extends
			MMIdentifierSet {

	private final static AtomicReference<RussianCentralBankIdentificationCodeIdentifier> repoTypeRef = new AtomicReference<>();

	public static RussianCentralBankIdentificationCodeIdentifier repoType() {
		repoTypeRef.compareAndSet(null,
				new RussianCentralBankIdentificationCodeIdentifier());
		return repoTypeRef.get();
	}

	private RussianCentralBankIdentificationCodeIdentifier() {
		super.identificationScheme = "Central Bank of Russia; RussianCentralBankIdentificationCode";
		super.pattern = "RU[0-9]{9,9}";
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "RussianCentralBankIdentificationCodeIdentifier";
		super.definition = "Russian Central Bank Identification Code. Identifies Russian financial institutions on the Russian national clearing system.";
		super.example = Arrays.asList("RU123456789");
	}
}