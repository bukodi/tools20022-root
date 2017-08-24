package com.tools20022.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class MandateOccurrences4 extends MMMessageComponent {

	private final static AtomicReference<MandateOccurrences4> repoTypeRef = new AtomicReference<>();

	public static MandateOccurrences4 repoType() {
		repoTypeRef.compareAndSet(null, new MandateOccurrences4());
		return repoTypeRef.get();
	}

	private MandateOccurrences4() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "MandateOccurrences4";
		super.definition = "Provides further details related to the duration of the mandate and the occurrence of the underlying transactions.";
	}
}