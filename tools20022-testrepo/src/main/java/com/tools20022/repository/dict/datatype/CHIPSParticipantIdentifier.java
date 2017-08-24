package com.tools20022.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;

public class CHIPSParticipantIdentifier extends MMIdentifierSet {

	private final static AtomicReference<CHIPSParticipantIdentifier> repoTypeRef = new AtomicReference<>();

	public static CHIPSParticipantIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new CHIPSParticipantIdentifier());
		return repoTypeRef.get();
	}

	private CHIPSParticipantIdentifier() {
		super.identificationScheme = "American Banker's Association (ABA); CHIPS Participant Number";
		super.pattern = "CP[0-9]{4,4}";
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "CHIPSParticipantIdentifier";
		super.definition = "(United States) Clearing House Interbank Payment System (CHIPS) Participant Identifier (ID). Identifies financial institutions participating on CHIPS. The CHIPS Participant ID is assigned by the New York Clearing House.";
		super.example = Arrays.asList("CP1234");
	}
}