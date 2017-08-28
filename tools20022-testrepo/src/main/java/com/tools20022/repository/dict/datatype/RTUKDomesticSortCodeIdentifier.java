package com.tools20022.repository.dict.datatype;


import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;/**
 * United Kingdom (UK) Sort Code. Identifies British financial institutions on the British national clearing systems. The sort code is assigned by the Association for Payments and Clearing Services (APACS).
 */
public class RTUKDomesticSortCodeIdentifier extends MMIdentifierSet {

	private final static AtomicReference<RTUKDomesticSortCodeIdentifier> repoTypeRef = new AtomicReference<>();

	public static RTUKDomesticSortCodeIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new RTUKDomesticSortCodeIdentifier());
		return repoTypeRef.get();
	}

	private RTUKDomesticSortCodeIdentifier() {
		super.identificationScheme = "Association for Payment Clearing Services (APACS); UK Sort Code";
		super.pattern = "SC[0-9]{6,6}";
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "UKDomesticSortCodeIdentifier";
		super.definition = "United Kingdom (UK) Sort Code. Identifies British financial institutions on the British national clearing systems. The sort code is assigned by the Association for Payments and Clearing Services (APACS).";
		super.example = Arrays.asList("SC123456");
	} }