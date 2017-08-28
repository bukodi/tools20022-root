package com.tools20022.repository.dict.datatype;


import com.tools20022.metamodel.MMIdentifierSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;/**
 * Data Universal Numbering System. A unique identification number provided by Dun 	&amp; Bradstreet to identify an organization.
 */
public class RTDunsIdentifier extends MMIdentifierSet {

	private final static AtomicReference<RTDunsIdentifier> repoTypeRef = new AtomicReference<>();

	public static RTDunsIdentifier repoType() {
		repoTypeRef.compareAndSet(null, new RTDunsIdentifier());
		return repoTypeRef.get();
	}

	private RTDunsIdentifier() {
		super.identificationScheme = "Dun & Bradstreet; DunsIdentifier";
		super.pattern = "[0-9]{9,9}";
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "DunsIdentifier";
		super.definition = "Data Universal Numbering System. A unique identification number provided by Dun & Bradstreet to identify an organization.";
		super.example = Arrays.asList("578942538");
	} }