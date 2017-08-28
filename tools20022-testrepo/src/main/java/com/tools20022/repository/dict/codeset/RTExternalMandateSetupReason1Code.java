package com.tools20022.repository.dict.codeset;


import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;/**
 * Specifies the external mandate setup reason code in the format of character string with a maximum length of 4 characters.
External code sets can be downloaded from www.iso20022.org.
 */
public class RTExternalMandateSetupReason1Code extends MMCodeSet {

	private final static AtomicReference<RTExternalMandateSetupReason1Code> repoTypeRef = new AtomicReference<>();

	public static RTExternalMandateSetupReason1Code repoType() {
		repoTypeRef
				.compareAndSet(null, new RTExternalMandateSetupReason1Code());
		return repoTypeRef.get();
	}

	private RTExternalMandateSetupReason1Code() {
		super.maxLength = 4;
		super.minLength = 1;
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "ExternalMandateSetupReason1Code";
		super.definition = "Specifies the external mandate setup reason code in the format of character string with a maximum length of 4 characters.\r\nExternal code sets can be downloaded from www.iso20022.org.";
	} }