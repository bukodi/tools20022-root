package com.tools20022.repository.dict.datatype;


import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;/**
 * Basic Bank Account Number (BBAN). Identifier used nationally by financial institutions, ie, in individual countries, generally as part of a National Account Numbering Scheme(s), which uniquely identifies the account of a customer.
 */
public class RTBBANIdentifier extends MMIdentifierSet {

	private final static AtomicReference<RTBBANIdentifier> repoTypeRef = new AtomicReference<>();

	public static RTBBANIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new RTBBANIdentifier());
		return repoTypeRef.get();
	}

	private RTBBANIdentifier() {
		super.identificationScheme = "National Banking Association; Basic Bank Account Number";
		super.pattern = "[a-zA-Z0-9]{1,30}";
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "BBANIdentifier";
		super.definition = "Basic Bank Account Number (BBAN). Identifier used nationally by financial institutions, ie, in individual countries, generally as part of a National Account Numbering Scheme(s), which uniquely identifies the account of a customer.";
		super.example = Arrays.asList("BARC12345612345678");
	} }