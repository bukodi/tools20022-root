package com.tools20022.repository.dict.other;


import com.tools20022.metamodel.MMExternalSchema;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;/**
 * Technical component that contains the validated supplementary data information. This technical envelope allows to segregate the supplementary data information from any other information.
 */
public class RTSupplementaryDataEnvelope1 extends MMExternalSchema {

	private final static AtomicReference<RTSupplementaryDataEnvelope1> repoTypeRef = new AtomicReference<>();

	public static RTSupplementaryDataEnvelope1 repoType() {
		repoTypeRef.compareAndSet(null, new RTSupplementaryDataEnvelope1());
		return repoTypeRef.get();
	}

	private RTSupplementaryDataEnvelope1() {
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "SupplementaryDataEnvelope1";
		super.definition = "Technical component that contains the validated supplementary data information. This technical envelope allows to segregate the supplementary data information from any other information.";
	} }