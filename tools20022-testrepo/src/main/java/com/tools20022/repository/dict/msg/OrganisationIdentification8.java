package com.tools20022.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class OrganisationIdentification8 extends MMMessageComponent {

	private final static AtomicReference<OrganisationIdentification8> repoTypeRef = new AtomicReference<>();

	public static OrganisationIdentification8 repoType() {
		repoTypeRef.compareAndSet(null, new OrganisationIdentification8());
		return repoTypeRef.get();
	}

	private OrganisationIdentification8() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "OrganisationIdentification8";
		super.definition = "Unique and unambiguous way to identify an organisation.";
	}
}