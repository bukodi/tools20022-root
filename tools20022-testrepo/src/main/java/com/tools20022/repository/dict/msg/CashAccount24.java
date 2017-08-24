package com.tools20022.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class CashAccount24 extends MMMessageComponent {

	private final static AtomicReference<CashAccount24> repoTypeRef = new AtomicReference<>();

	public static CashAccount24 repoType() {
		repoTypeRef.compareAndSet(null, new CashAccount24());
		return repoTypeRef.get();
	}

	private CashAccount24() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "CashAccount24";
		super.definition = "Provides the details to identify an account.";
	}
}