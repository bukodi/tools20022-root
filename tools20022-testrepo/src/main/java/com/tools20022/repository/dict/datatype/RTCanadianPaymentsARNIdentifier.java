package com.tools20022.repository.dict.datatype;


import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;/**
 * Canadian Payments Association Routing Number. Identifies Canadian financial institutions on the Canadian national clearing system.
 */
public class RTCanadianPaymentsARNIdentifier extends MMIdentifierSet {

	private final static AtomicReference<RTCanadianPaymentsARNIdentifier> repoTypeRef = new AtomicReference<>();

	public static RTCanadianPaymentsARNIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new RTCanadianPaymentsARNIdentifier());
		return repoTypeRef.get();
	}

	private RTCanadianPaymentsARNIdentifier() {
		super.identificationScheme = "Candian Payment Association; Payment Routing Number";
		super.pattern = "CA[0-9]{9,9}";
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "CanadianPaymentsARNIdentifier";
		super.definition = "Canadian Payments Association Routing Number. Identifies Canadian financial institutions on the Canadian national clearing system.";
		super.example = Arrays.asList("CA123456789");
	} }