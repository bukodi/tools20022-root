package com.tools20022.repository.dict.datatype;

import com.tools20022.metamodel.MMBinary;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.repository.GeneratedRepository;

public class Max140Binary extends MMBinary {

	private final static AtomicReference<Max140Binary> repoTypeRef = new AtomicReference<>();

	public static Max140Binary repoType() {
		repoTypeRef.compareAndSet(null, new Max140Binary());
		return repoTypeRef.get();
	}

	private Max140Binary() {
		super.maxLength = 140;
		super.minLength = 1;
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Max140Binary";
		super.definition = "Specifies a binary string with a maximum length of 140 binary bytes.";
	}
}