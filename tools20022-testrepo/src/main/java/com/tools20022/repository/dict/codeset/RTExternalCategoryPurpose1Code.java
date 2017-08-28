package com.tools20022.repository.dict.codeset;


import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;/**
 * Specifies the category purpose, as published in an external category purpose code list.
External code sets can be downloaded from www.iso20022.org.
 */
public class RTExternalCategoryPurpose1Code extends MMCodeSet {

	private final static AtomicReference<RTExternalCategoryPurpose1Code> repoTypeRef = new AtomicReference<>();

	public static RTExternalCategoryPurpose1Code repoType() {
		repoTypeRef.compareAndSet(null, new RTExternalCategoryPurpose1Code());
		return repoTypeRef.get();
	}

	private RTExternalCategoryPurpose1Code() {
		super.maxLength = 4;
		super.minLength = 1;
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "ExternalCategoryPurpose1Code";
		super.definition = "Specifies the category purpose, as published in an external category purpose code list.\r\nExternal code sets can be downloaded from www.iso20022.org.";
		super.example = Arrays.asList("CORT");
	} }