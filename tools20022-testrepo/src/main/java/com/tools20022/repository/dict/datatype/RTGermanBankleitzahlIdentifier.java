package com.tools20022.repository.dict.datatype;


import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;/**
 * German Bankleitzahl. Identifies German financial institutions on the German national clearing systems.
 */
public class RTGermanBankleitzahlIdentifier extends MMIdentifierSet {

	private final static AtomicReference<RTGermanBankleitzahlIdentifier> repoTypeRef = new AtomicReference<>();

	public static RTGermanBankleitzahlIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new RTGermanBankleitzahlIdentifier());
		return repoTypeRef.get();
	}

	private RTGermanBankleitzahlIdentifier() {
		super.identificationScheme = "Deutsche Bundesbank ; German Bankleitzahl";
		super.pattern = "BL[0-9]{8,8}";
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "GermanBankleitzahlIdentifier";
		super.definition = "German Bankleitzahl. Identifies German financial institutions on the German national clearing systems.";
		super.example = Arrays.asList("BL12345678");
	} }