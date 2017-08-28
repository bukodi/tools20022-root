package com.tools20022.repository.dict.datatype;


import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;/**
 * Indian Financial System Code Identifier. Identifies Indian financial institutions on the Indian national clearing system.
 */
public class RTIndianFinancialSystemCodeIdentifier extends MMIdentifierSet {

	private final static AtomicReference<RTIndianFinancialSystemCodeIdentifier> repoTypeRef = new AtomicReference<>();

	public static RTIndianFinancialSystemCodeIdentifier repoType() {
		repoTypeRef.compareAndSet(null,
				new RTIndianFinancialSystemCodeIdentifier());
		return repoTypeRef.get();
	}

	private RTIndianFinancialSystemCodeIdentifier() {
		super.identificationScheme = "Indian Financial System; Payment Routing Number";
		super.pattern = "IN[a-zA-Z0-9]{11,11}";
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "IndianFinancialSystemCodeIdentifier";
		super.definition = "Indian Financial System Code Identifier. Identifies Indian financial institutions on the Indian national clearing system.";
		super.example = Arrays.asList("IN12azBX12345");
	} }