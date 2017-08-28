package com.tools20022.repository.dict.datatype;


import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;/**
 * Russian Central Bank Identification Code. Identifies Russian financial institutions on the Russian national clearing system.
 */
public class RTRussianCentralBankIdentificationCodeIdentifier extends MMIdentifierSet {

	private final static AtomicReference<RTRussianCentralBankIdentificationCodeIdentifier> repoTypeRef = new AtomicReference<>();

	public static RTRussianCentralBankIdentificationCodeIdentifier repoType() {
		repoTypeRef.compareAndSet(null,
				new RTRussianCentralBankIdentificationCodeIdentifier());
		return repoTypeRef.get();
	}

	private RTRussianCentralBankIdentificationCodeIdentifier() {
		super.identificationScheme = "Central Bank of Russia; RussianCentralBankIdentificationCode";
		super.pattern = "RU[0-9]{9,9}";
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "RussianCentralBankIdentificationCodeIdentifier";
		super.definition = "Russian Central Bank Identification Code. Identifies Russian financial institutions on the Russian national clearing system.";
		super.example = Arrays.asList("RU123456789");
	} }