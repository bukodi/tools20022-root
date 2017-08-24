package com.tools20022.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.repository.dict.entity.OrganisationIdentification;
import com.tools20022.repository.dict.entity.Organisation;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class Organisation extends MMBusinessComponent {

	private final static AtomicReference<Organisation> repoTypeRef = new AtomicReference<>();
	public final MMBusinessAssociationEnd refOrganisationIdentification = new MMBusinessAssociationEnd() {
		{
			super.type_lazy = () -> OrganisationIdentification.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Organisation.repoType();
			super.name = "OrganisationIdentification";
			super.definition = "Specific identification assigned to an organisation. It is derived from the association between Party and PartyIdentification.";
			super.minOccurs = 0;
		}
	};

	public static Organisation repoType() {
		repoTypeRef.compareAndSet(null, new Organisation());
		return repoTypeRef.get();
	}

	private Organisation() {
		super.element = Arrays.asList(refOrganisationIdentification);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Organisation";
		super.definition = "Organised structure that is set up for a particular purpose. For example, a business, government body, department, charity, or financial institution.";
	}
}