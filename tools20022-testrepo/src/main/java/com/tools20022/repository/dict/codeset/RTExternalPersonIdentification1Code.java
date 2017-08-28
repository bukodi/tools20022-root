package com.tools20022.repository.dict.codeset;


import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;/**
 * Specifies the external person identification scheme name code in the format of character string with a maximum length of 4 characters.
The list of valid codes is an external code list published separately.
External code sets can be downloaded from www.iso20022.org.
 */
public class RTExternalPersonIdentification1Code extends MMCodeSet {

	private final static AtomicReference<RTExternalPersonIdentification1Code> repoTypeRef = new AtomicReference<>();

	public static RTExternalPersonIdentification1Code repoType() {
		repoTypeRef.compareAndSet(null,
				new RTExternalPersonIdentification1Code());
		return repoTypeRef.get();
	}

	private RTExternalPersonIdentification1Code() {
		super.maxLength = 4;
		super.minLength = 1;
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "ExternalPersonIdentification1Code";
		super.definition = "Specifies the external person identification scheme name code in the format of character string with a maximum length of 4 characters.\r\nThe list of valid codes is an external code list published separately.\r\nExternal code sets can be downloaded from www.iso20022.org.";
		super.example = Arrays.asList("ARNU");
	} }