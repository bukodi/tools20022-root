package com.tools20022.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;

public class SwissSICIdentifier extends MMIdentifierSet {

	private final static AtomicReference<SwissSICIdentifier> repoTypeRef = new AtomicReference<>();

	public static SwissSICIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new SwissSICIdentifier());
		return repoTypeRef.get();
	}

	private SwissSICIdentifier() {
		super.identificationScheme = "Swiss Interbank Clearing Ltd; SIC Identifier";
		super.pattern = "SW[0-9]{6,6}";
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "SwissSICIdentifier";
		super.definition = "Swiss Interbank Clearing (SIC) Code. Identifies Swiss financial institutions domestically, on the Swiss national clearing system.";
		super.example = Arrays.asList("SW123456");
	}
}