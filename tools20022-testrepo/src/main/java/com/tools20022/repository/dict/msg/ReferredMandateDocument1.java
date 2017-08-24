package com.tools20022.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class ReferredMandateDocument1 extends MMMessageComponent {

	private final static AtomicReference<ReferredMandateDocument1> repoTypeRef = new AtomicReference<>();

	public static ReferredMandateDocument1 repoType() {
		repoTypeRef.compareAndSet(null, new ReferredMandateDocument1());
		return repoTypeRef.get();
	}

	private ReferredMandateDocument1() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "ReferredMandateDocument1";
		super.definition = "Identifies the documents referred to in the remittance information.";
	}
}