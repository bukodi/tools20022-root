package com.tools20022.repository.dict.datatype;


import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;/**
 * Hellenic Bank Identification Code Identifier. Identifies Greek financial institutions on the greek national clearing system.
 */
public class RTHellenicBankIdentificationCodeIdentifier extends MMIdentifierSet {

	private final static AtomicReference<RTHellenicBankIdentificationCodeIdentifier> repoTypeRef = new AtomicReference<>();

	public static RTHellenicBankIdentificationCodeIdentifier repoType() {
		repoTypeRef.compareAndSet(null,
				new RTHellenicBankIdentificationCodeIdentifier());
		return repoTypeRef.get();
	}

	private RTHellenicBankIdentificationCodeIdentifier() {
		super.identificationScheme = "Hellenic Central Bank; Payment Routing Number";
		super.pattern = "GR[0-9]{7,7}";
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "HellenicBankIdentificationCodeIdentifier";
		super.definition = "Hellenic Bank Identification Code Identifier. Identifies Greek financial institutions on the greek national clearing system.";
		super.example = Arrays.asList("GR1234567");
	} }