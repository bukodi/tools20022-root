package com.tools20022.repository.dict.codeset;


import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;/**
 * Specifies the clearing system identification code, as published in an external clearing system identification code list.
External code sets can be downloaded from www.iso20022.org.
 */
public class RTExternalClearingSystemIdentification1Code extends MMCodeSet {

	private final static AtomicReference<RTExternalClearingSystemIdentification1Code> repoTypeRef = new AtomicReference<>();

	public static RTExternalClearingSystemIdentification1Code repoType() {
		repoTypeRef.compareAndSet(null,
				new RTExternalClearingSystemIdentification1Code());
		return repoTypeRef.get();
	}

	private RTExternalClearingSystemIdentification1Code() {
		super.maxLength = 5;
		super.minLength = 1;
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "ExternalClearingSystemIdentification1Code";
		super.definition = "Specifies the clearing system identification code, as published in an external clearing system identification code list.\r\nExternal code sets can be downloaded from www.iso20022.org.";
		super.example = Arrays.asList("AUBSB");
	} }