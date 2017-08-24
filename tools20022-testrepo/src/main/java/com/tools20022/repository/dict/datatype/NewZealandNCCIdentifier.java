package com.tools20022.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;

public class NewZealandNCCIdentifier extends MMIdentifierSet {

	private final static AtomicReference<NewZealandNCCIdentifier> repoTypeRef = new AtomicReference<>();

	public static NewZealandNCCIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new NewZealandNCCIdentifier());
		return repoTypeRef.get();
	}

	private NewZealandNCCIdentifier() {
		super.identificationScheme = "New Zealand Bankers Association; NewZealandNCC";
		super.pattern = "NZ[0-9]{6,6}";
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "NewZealandNCCIdentifier";
		super.definition = "New Zealand Bank/Branch Code. Identifies New Zealand institutions on the New Zealand national clearing system. The code is assigned by the New Zealand Bankers' Association (NZBA).";
		super.example = Arrays.asList("NZ123456");
	}
}