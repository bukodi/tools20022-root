package com.tools20022.repository.dict.entity;


import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.repository.dict.entity.RTContactPoint;
import com.tools20022.repository.dict.entity.RTParty;
import com.tools20022.repository.dict.entity.RTPartyIdentificationInformation;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Entity involved in an activity.
 */
public class RTParty extends MMBusinessComponent {

	private final static AtomicReference<RTParty> repoTypeRef = new AtomicReference<>();
	/**
	 * Number, physical or virtual address, used for communication.
	 */
	public final MMBusinessAssociationEnd refContactPoint = new MMBusinessAssociationEnd() {
		{
			super.type_lazy = () -> RTContactPoint.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTParty.repoType();
			super.name = "ContactPoint";
			super.definition = "Number, physical or virtual address, used for communication.";
			super.minOccurs = 1;
		}
	};
	/**
	 * Specific identification assigned to a party.
	 */
	public final MMBusinessAssociationEnd refIdentification = new MMBusinessAssociationEnd() {
		{
			super.type_lazy = () -> RTPartyIdentificationInformation.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTParty.repoType();
			super.name = "Identification";
			super.definition = "Specific identification assigned to a party.";
			super.minOccurs = 1;
		}
	};

	public static RTParty repoType() {
		repoTypeRef.compareAndSet(null, new RTParty());
		return repoTypeRef.get();
	}

	private RTParty() {
		super.element = Arrays.asList(refContactPoint, refIdentification);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "Party";
		super.definition = "Entity involved in an activity.";
	} }