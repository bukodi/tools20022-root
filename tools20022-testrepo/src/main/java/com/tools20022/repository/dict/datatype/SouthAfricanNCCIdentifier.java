package com.tools20022.repository.dict.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;

public class SouthAfricanNCCIdentifier extends MMIdentifierSet {

	private final static AtomicReference<SouthAfricanNCCIdentifier> repoTypeRef = new AtomicReference<>();

	public static SouthAfricanNCCIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new SouthAfricanNCCIdentifier());
		return repoTypeRef.get();
	}

	private SouthAfricanNCCIdentifier() {
		super.identificationScheme = "South African Bankers Services Company Ltd (Bank Serv); South African National Clearing system Code";
		super.pattern = "ZA[0-9]{6,6}";
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "SouthAfricanNCCIdentifier";
		super.definition = "South African National Clearing Code (NCC). Identifies South African financial institutions on the South African national clearing system. The code is assigned by the South African Bankers Services Company Ltd. (BankServ).";
		super.example = Arrays.asList("ZA123456");
	}
}