package com.tools20022.repository.dict.entity;


import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.repository.dict.entity.RTOrganisationIdentification;
import com.tools20022.repository.dict.entity.RTOrganisation;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Organised structure that is set up for a particular purpose. For example, a business, government body, department, charity, or financial institution.
 */
public class RTOrganisation extends MMBusinessComponent {

	private final static AtomicReference<RTOrganisation> repoTypeRef = new AtomicReference<>();
	/**
	 * Specific identification assigned to an organisation. It is derived from the association between Party and PartyIdentification.
	 */
	public final MMBusinessAssociationEnd refOrganisationIdentification = new MMBusinessAssociationEnd() {
		{
			super.type_lazy = () -> RTOrganisationIdentification.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTOrganisation.repoType();
			super.name = "OrganisationIdentification";
			super.definition = "Specific identification assigned to an organisation. It is derived from the association between Party and PartyIdentification.";
			super.minOccurs = 0;
		}
	};

	public static RTOrganisation repoType() {
		repoTypeRef.compareAndSet(null, new RTOrganisation());
		return repoTypeRef.get();
	}

	private RTOrganisation() {
		super.element = Arrays.asList(refOrganisationIdentification);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Organisation";
		super.definition = "Organised structure that is set up for a particular purpose. For example, a business, government body, department, charity, or financial institution.";
	} }