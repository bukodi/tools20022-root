package com.tools20022.repository.dict.datatype;


import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;/**
 * Fedwire Routing Number. Identifies financial institutions, in the US, on the FedWire system. The routing number is assigned by the American Bankers Association (ABA).
 */
public class RTFedwireRoutingNumberIdentifier extends MMIdentifierSet {

	private final static AtomicReference<RTFedwireRoutingNumberIdentifier> repoTypeRef = new AtomicReference<>();

	public static RTFedwireRoutingNumberIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new RTFedwireRoutingNumberIdentifier());
		return repoTypeRef.get();
	}

	private RTFedwireRoutingNumberIdentifier() {
		super.identificationScheme = "US Federal Reserve Bank ; FedwireRoutingNumberIdentifier";
		super.pattern = "FW[0-9]{9,9}";
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "FedwireRoutingNumberIdentifier";
		super.definition = "Fedwire Routing Number. Identifies financial institutions, in the US, on the FedWire system. The routing number is assigned by the American Bankers Association (ABA).";
		super.example = Arrays.asList("FW123456789");
	} }