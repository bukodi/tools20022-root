package com.tools20022.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;

public class CHIPSUniversalIdentifier extends MMIdentifierSet {

	private final static AtomicReference<CHIPSUniversalIdentifier> repoTypeRef = new AtomicReference<>();

	public static CHIPSUniversalIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new CHIPSUniversalIdentifier());
		return repoTypeRef.get();
	}

	private CHIPSUniversalIdentifier() {
		super.identificationScheme = "American Banker's Association (ABA); CHIPS UID";
		super.pattern = "CH[0-9]{6,6}";
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "CHIPSUniversalIdentifier";
		super.definition = "(United States) Clearing House Interbank Payments System (CHIPS) Universal Identification  (UID).  Identifies entities that own accounts at CHIPS participating financial institutions, through which CHIPS payments are effected.  The CHIPS UID is assigned by the New York Clearing House.";
		super.example = Arrays.asList("CH123456");
	}
}