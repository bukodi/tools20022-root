package com.tools20022.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class GenericAccountIdentification1 extends MMMessageComponent {

	private final static AtomicReference<GenericAccountIdentification1> repoTypeRef = new AtomicReference<>();

	public static GenericAccountIdentification1 repoType() {
		repoTypeRef.compareAndSet(null, new GenericAccountIdentification1());
		return repoTypeRef.get();
	}

	private GenericAccountIdentification1() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "GenericAccountIdentification1";
		super.definition = "Information related to a generic account identification.";
	}
}