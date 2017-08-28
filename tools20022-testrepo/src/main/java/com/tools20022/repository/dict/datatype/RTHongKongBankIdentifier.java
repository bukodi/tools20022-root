package com.tools20022.repository.dict.datatype;


import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;/**
 * Hong Kong Bank Code. Identifies Hong Kong financial institutions on the Hong Kong local clearing system.
 */
public class RTHongKongBankIdentifier extends MMIdentifierSet {

	private final static AtomicReference<RTHongKongBankIdentifier> repoTypeRef = new AtomicReference<>();

	public static RTHongKongBankIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new RTHongKongBankIdentifier());
		return repoTypeRef.get();
	}

	private RTHongKongBankIdentifier() {
		super.identificationScheme = "Hong Kong Interbank Clearing Ltd (HKICL); Bank Code of Hong Kong";
		super.pattern = "HK[0-9]{3,3}";
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "HongKongBankIdentifier";
		super.definition = "Hong Kong Bank Code. Identifies Hong Kong financial institutions on the Hong Kong local clearing system.";
		super.example = Arrays.asList("HK123");
	} }