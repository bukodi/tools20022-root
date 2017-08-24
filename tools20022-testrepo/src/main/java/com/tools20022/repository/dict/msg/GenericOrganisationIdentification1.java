package com.tools20022.repository.dict.msg;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class GenericOrganisationIdentification1 extends MMMessageComponent {

	private final static AtomicReference<GenericOrganisationIdentification1> repoTypeRef = new AtomicReference<>();

	public static GenericOrganisationIdentification1 repoType() {
		repoTypeRef.compareAndSet(null,
				new GenericOrganisationIdentification1());
		return repoTypeRef.get();
	}

	private GenericOrganisationIdentification1() {
		super.messageElement = Arrays.asList();
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "GenericOrganisationIdentification1";
		super.definition = "Information related to an identification of an organisation.";
	}
}