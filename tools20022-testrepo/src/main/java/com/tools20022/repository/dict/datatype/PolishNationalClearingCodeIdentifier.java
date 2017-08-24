package com.tools20022.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;

public class PolishNationalClearingCodeIdentifier extends MMIdentifierSet {

	private final static AtomicReference<PolishNationalClearingCodeIdentifier> repoTypeRef = new AtomicReference<>();

	public static PolishNationalClearingCodeIdentifier repoType() {
		repoTypeRef.compareAndSet(null,
				new PolishNationalClearingCodeIdentifier());
		return repoTypeRef.get();
	}

	private PolishNationalClearingCodeIdentifier() {
		super.identificationScheme = "Polish Central Bank; Payment Routing Number";
		super.pattern = "PL[0-9]{8,8}";
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "PolishNationalClearingCodeIdentifier";
		super.definition = "Polish National Clearing Code Identifier. Identifies Polish financial institutions on the Polish national clearing system.";
		super.example = Arrays.asList("PL12345678");
	}
}