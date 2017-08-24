package com.tools20022.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.repository.dict.entity.ContactPoint;
import com.tools20022.repository.dict.entity.Party;
import com.tools20022.repository.dict.entity.PartyIdentificationInformation;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;

public class Party extends MMBusinessComponent {

	private final static AtomicReference<Party> repoTypeRef = new AtomicReference<>();
	public final MMBusinessAssociationEnd refContactPoint = new MMBusinessAssociationEnd() {
		{
			super.type_lazy = () -> ContactPoint.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Party.repoType();
			super.name = "ContactPoint";
			super.definition = "Number, physical or virtual address, used for communication.";
			super.minOccurs = 1;
		}
	};
	public final MMBusinessAssociationEnd refIdentification = new MMBusinessAssociationEnd() {
		{
			super.type_lazy = () -> PartyIdentificationInformation.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> Party.repoType();
			super.name = "Identification";
			super.definition = "Specific identification assigned to a party.";
			super.minOccurs = 1;
		}
	};

	public static Party repoType() {
		repoTypeRef.compareAndSet(null, new Party());
		return repoTypeRef.get();
	}

	private Party() {
		super.element = Arrays.asList(refContactPoint, refIdentification);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Party";
		super.definition = "Entity involved in an activity.";
	}
}