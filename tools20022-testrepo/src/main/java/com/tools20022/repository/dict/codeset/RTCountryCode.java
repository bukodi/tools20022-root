package com.tools20022.repository.dict.codeset;


import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;/**
 * Code to identify a country, a dependency, or another area of particular geopolitical interest, on the basis of country names obtained from the United Nations (ISO 3166, Alpha-2 code).
 */
public class RTCountryCode extends MMCodeSet {

	private final static AtomicReference<RTCountryCode> repoTypeRef = new AtomicReference<>();

	public static RTCountryCode repoType() {
		repoTypeRef.compareAndSet(null, new RTCountryCode());
		return repoTypeRef.get();
	}

	private RTCountryCode() {
		super.pattern = "[A-Z]{2,2}";
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "CountryCode";
		super.definition = "Code to identify a country, a dependency, or another area of particular geopolitical interest, on the basis of country names obtained from the United Nations (ISO 3166, Alpha-2 code).";
		super.example = Arrays.asList("BE");
		super.constraint = Arrays.asList();
	} }