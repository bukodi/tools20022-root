package com.tools20022.repository.dict.codeset;


import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;/**
 * Specifies an external code in the format of character string with a maximum length of 35 characters.
The list of valid codes is an external code list published separately.
External code sets can be downloaded from www.iso20022.org.
 */
public class RTExternalCode extends MMCodeSet {

	private final static AtomicReference<RTExternalCode> repoTypeRef = new AtomicReference<>();

	public static RTExternalCode repoType() {
		repoTypeRef.compareAndSet(null, new RTExternalCode());
		return repoTypeRef.get();
	}

	private RTExternalCode() {
		super.maxLength = 35;
		super.minLength = 1;
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "ExternalCode";
		super.definition = "Specifies an external code in the format of character string with a maximum length of 35 characters.\r\nThe list of valid codes is an external code list published separately.\r\nExternal code sets can be downloaded from www.iso20022.org.";
		super.example = Arrays.asList("External  Code 1");
	} }