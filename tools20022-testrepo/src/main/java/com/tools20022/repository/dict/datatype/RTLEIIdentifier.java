package com.tools20022.repository.dict.datatype;


import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;/**
 * Legal Entity Identifier is a code allocated to a party as described in ISO 17442 "Financial Services - Legal Entity Identifier (LEI)".
 */
public class RTLEIIdentifier extends MMIdentifierSet {

	private final static AtomicReference<RTLEIIdentifier> repoTypeRef = new AtomicReference<>();

	public static RTLEIIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new RTLEIIdentifier());
		return repoTypeRef.get();
	}

	private RTLEIIdentifier() {
		super.identificationScheme = "SWIFT and DTCC; LEIIdentifier";
		super.pattern = "[A-Z0-9]{18,18}[0-9]{2,2}";
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "LEIIdentifier";
		super.definition = "Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".";
		super.example = Arrays.asList("123456789012345678");
	} }