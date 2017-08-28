package com.tools20022.repository.dict.datatype;


import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;/**
 * Portuguese National Clearing Code. Identifies Portuguese financial institutions on the Portuguese national clearing system.
 */
public class RTPortugueseNCCIdentifier extends MMIdentifierSet {

	private final static AtomicReference<RTPortugueseNCCIdentifier> repoTypeRef = new AtomicReference<>();

	public static RTPortugueseNCCIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new RTPortugueseNCCIdentifier());
		return repoTypeRef.get();
	}

	private RTPortugueseNCCIdentifier() {
		super.identificationScheme = "Banco de Portugal; PortugueseNCC";
		super.pattern = "PT[0-9]{8,8}";
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "PortugueseNCCIdentifier";
		super.definition = "Portuguese National Clearing Code. Identifies Portuguese financial institutions on the Portuguese national clearing system.";
		super.example = Arrays.asList("PT12345678");
	} }