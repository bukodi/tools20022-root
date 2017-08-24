package com.tools20022.repository.dict.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class CategoryPurpose1Choice extends MMChoiceComponent {

	private final static AtomicReference<CategoryPurpose1Choice> repoTypeRef = new AtomicReference<>();

	public static CategoryPurpose1Choice repoType() {
		repoTypeRef.compareAndSet(null, new CategoryPurpose1Choice());
		return repoTypeRef.get();
	}

	private CategoryPurpose1Choice() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "CategoryPurpose1Choice";
		super.definition = "Specifies the high level purpose of the instruction based on a set of pre-defined categories.\nUsage: This is used by the initiating party to provide information concerning the processing of the payment. It is likely to trigger special processing by any of the agents involved in the payment chain.";
	}
}