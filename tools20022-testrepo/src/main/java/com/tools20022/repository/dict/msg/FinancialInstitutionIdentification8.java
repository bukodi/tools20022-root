package com.tools20022.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class FinancialInstitutionIdentification8 extends MMMessageComponent {

	private final static AtomicReference<FinancialInstitutionIdentification8> repoTypeRef = new AtomicReference<>();

	public static FinancialInstitutionIdentification8 repoType() {
		repoTypeRef.compareAndSet(null,
				new FinancialInstitutionIdentification8());
		return repoTypeRef.get();
	}

	private FinancialInstitutionIdentification8() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "FinancialInstitutionIdentification8";
		super.definition = "Set of elements used to identify a financial institution.";
	}
}