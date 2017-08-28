package com.tools20022.repository.dict.codeset;


import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;/**
 * Specifies the nature, or use, of the cash account in the format of character string with a maximum length of 4 characters.
The list of valid codes is an external code list published separately.
External code sets can be downloaded from www.iso20022.org.
 */
public class RTExternalCashAccountType1Code extends MMCodeSet {

	private final static AtomicReference<RTExternalCashAccountType1Code> repoTypeRef = new AtomicReference<>();

	public static RTExternalCashAccountType1Code repoType() {
		repoTypeRef.compareAndSet(null, new RTExternalCashAccountType1Code());
		return repoTypeRef.get();
	}

	private RTExternalCashAccountType1Code() {
		super.maxLength = 4;
		super.minLength = 1;
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "ExternalCashAccountType1Code";
		super.definition = "Specifies the nature, or use, of the cash account in the format of character string with a maximum length of 4 characters.\r\nThe list of valid codes is an external code list published separately.\r\nExternal code sets can be downloaded from www.iso20022.org.";
		super.example = Arrays.asList("BBAN");
	} }