package com.tools20022.repository.dict.datatype;


import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;/**
 * Austrian Bankleitzahl. Identifies Austrian financial institutions on the Austrian national clearing system.
 */
public class RTAustrianBankleitzahlIdentifier extends MMIdentifierSet {

	private final static AtomicReference<RTAustrianBankleitzahlIdentifier> repoTypeRef = new AtomicReference<>();

	public static RTAustrianBankleitzahlIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new RTAustrianBankleitzahlIdentifier());
		return repoTypeRef.get();
	}

	private RTAustrianBankleitzahlIdentifier() {
		super.identificationScheme = "Oesterreichische NationalBank; Austrian Bankleitzahl";
		super.pattern = "AT[0-9]{5,5}";
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "AustrianBankleitzahlIdentifier";
		super.definition = "Austrian Bankleitzahl. Identifies Austrian financial institutions on the Austrian national clearing system.";
		super.example = Arrays.asList("AT12345");
	} }