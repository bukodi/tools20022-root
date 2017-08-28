package com.tools20022.repository.dict.datatype;


import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;/**
 * Code allocated to a financial institution by the ISO 9362 Registration Authority as described in ISO 9362 "Banking - Banking telecommunication messages - Business identifier code (BIC)".
 */
public class RTBICFIIdentifier extends MMIdentifierSet {

	private final static AtomicReference<RTBICFIIdentifier> repoTypeRef = new AtomicReference<>();

	public static RTBICFIIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new RTBICFIIdentifier());
		return repoTypeRef.get();
	}

	private RTBICFIIdentifier() {
		super.identificationScheme = "SWIFT; BICIdentifier";
		super.pattern = "[A-Z]{6,6}[A-Z2-9][A-NP-Z0-9]([A-Z0-9]{3,3}){0,1}";
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "BICFIIdentifier";
		super.definition = "Code allocated to a financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
		super.example = Arrays.asList("CHASUS33");
		super.constraint = Arrays.asList();
	} }